/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;

import DTO.NhanVienDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author HHH
 */
public class NhanVienExcel {

    public ArrayList<NhanVienDTO> importNhanVien() throws FileNotFoundException, IOException {
        ArrayList<NhanVienDTO> nhanvien = new ArrayList();

        // Đọc một file XSL.
        FileInputStream inputStream = new FileInputStream(new File("NhanSu.xlsx"));

        // Đối tượng workbook cho file XSL.
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        // Lấy ra sheet đầu tiên từ workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        FormulaEvaluator formula = workbook.getCreationHelper().createFormulaEvaluator();
        int count = 0;
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
            if(!isFirstRow)
                nhanvien.add(item);
            count++;
        }
        System.out.println(count);

        return nhanvien;
    }

//    public static void checkImport() {
//        try {
//            ArrayList<NhanVienDTO> nhanvien = importNhanVien();
//            for (NhanVienDTO item : nhanvien) {
//                System.out.println(item.toString());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//
//        }
//    }
//
//    public static void main(String[] arg) {
//        checkImport();
//    }
}
