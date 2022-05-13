/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author HHH
 */
public class NhanVienExcel {

    public static final int COLUMN_INDEX_MANV = 0;
    public static final int COLUMN_INDEX_HINHNV = 1;
    public static final int COLUMN_INDEX_TENNV = 2;
    public static final int COLUMN_INDEX_NGAYSINH = 3;
    public static final int COLUMN_INDEX_GIOITINH = 4;
    public static final int COLUMN_INDEX_DIACHI = 5;
    public static final int COLUMN_INDEX_SOCMND = 6;
    public static final int COLUMN_INDEX_SODIENTHOAI = 7;
    public static final int COLUMN_INDEX_EMAIL = 8;

    NhanVienDAO nhanviendao = new NhanVienDAO();

    public boolean importNhanVien(String filepath) throws FileNotFoundException, IOException {

        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(new File(filepath));

        // Đối tượng workbook cho file XSL.
        Workbook workbook = getWorkbook(inputStream, filepath);
        // Lấy ra sheet đầu tiên từ workbook
        Sheet sheet = workbook.getSheetAt(0);

//        FormulaEvaluator formula = workbook.getCreationHelper().createFormulaEvaluator();
        for (Row row : sheet) {
            NhanVienDTO item = new NhanVienDTO();
            boolean isFirstRow = false;
            for (Cell cell : row) {
                if (cell.getRowIndex() == 0) {
                    isFirstRow = true;
                    break;
                }
                switch (cell.getColumnIndex() + 1) {
                    case 1 -> item.setMaNV(cell.getStringCellValue());
                    case 2 -> item.setHinhNV(cell.getStringCellValue());
                    case 3 -> item.setTenNV(cell.getStringCellValue());
                    case 4 -> item.setNgaySinh(cell.getStringCellValue());
                    case 5 -> item.setGioiTinh(cell.getStringCellValue());
                    case 6 -> item.setDiaChi(cell.getStringCellValue());
                    case 7 -> item.setSoCMND(cell.getStringCellValue());
                    case 8 -> item.setSoDienThoai(cell.getStringCellValue());
                    case 9 -> item.setEmail(cell.getStringCellValue());
                }
            }
            if (!isFirstRow && !"".equals(item.getMaNV()) && item.getHinhNV() != null) {
                nhanviendao.addNhanVien(item);
            }
        }
        workbook.close();
        inputStream.close();

        return true;
    }

    public boolean exportNhanVien(String filepath) throws FileNotFoundException, IOException {
        FileOutputStream outputStream = new FileOutputStream(new File(filepath));
        Workbook workbook = getWorkbook(filepath);

        Sheet sheet = workbook.createSheet("NhanVien");

        ArrayList<NhanVienDTO> nhanvien = nhanviendao.getNhanVien();
        int rowIndex = 0;

        writeHeader(sheet, rowIndex);
        rowIndex++;

        for (NhanVienDTO item : nhanvien) {
            Row row = sheet.createRow(rowIndex);
            writeData(item, row);
            rowIndex++;
        }

        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        return true;
    }

    private static void writeHeader(Sheet sheet, int rowIndex) {
        // Create row
        Row row = sheet.createRow(rowIndex);

        // Create cells
        Cell cell = row.createCell(COLUMN_INDEX_MANV);
        cell.setCellValue("Mã nhân viên");

        cell = row.createCell(COLUMN_INDEX_HINHNV);
        cell.setCellValue("Hình nhân viên");

        cell = row.createCell(COLUMN_INDEX_TENNV);
        cell.setCellValue("Tên nhân viên");

        cell = row.createCell(COLUMN_INDEX_NGAYSINH);
        cell.setCellValue("Ngày sinh");

        cell = row.createCell(COLUMN_INDEX_GIOITINH);
        cell.setCellValue("Giới tính");

        cell = row.createCell(COLUMN_INDEX_DIACHI);
        cell.setCellValue("Địa chỉ");

        cell = row.createCell(COLUMN_INDEX_SOCMND);
        cell.setCellValue("Số CMND");

        cell = row.createCell(COLUMN_INDEX_SODIENTHOAI);
        cell.setCellValue("Số điện thoại");

        cell = row.createCell(COLUMN_INDEX_EMAIL);
        cell.setCellValue("Email");
    }

    private static void writeData(NhanVienDTO item, Row row) {
        Cell cell = row.createCell(COLUMN_INDEX_MANV);
        cell.setCellValue(item.getMaNV());

        cell = row.createCell(COLUMN_INDEX_HINHNV);
        cell.setCellValue(item.getHinhNV());

        cell = row.createCell(COLUMN_INDEX_TENNV);
        cell.setCellValue(item.getTenNV());

        cell = row.createCell(COLUMN_INDEX_NGAYSINH);
        cell.setCellValue(item.getNgaySinh());

        cell = row.createCell(COLUMN_INDEX_GIOITINH);
        cell.setCellValue(item.getGioiTinh());

        cell = row.createCell(COLUMN_INDEX_DIACHI);
        cell.setCellValue(item.getDiaChi());

        cell = row.createCell(COLUMN_INDEX_SOCMND);
        cell.setCellValue(item.getSoCMND());

        cell = row.createCell(COLUMN_INDEX_SODIENTHOAI);
        cell.setCellValue(item.getSoDienThoai());

        cell = row.createCell(COLUMN_INDEX_EMAIL);
        cell.setCellValue(item.getEmail());
    }

    private static Workbook getWorkbook(String excelFilePath) throws IOException {
        Workbook workbook = null;

        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook();
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook();
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }

    private static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }
}