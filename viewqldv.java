/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xoan
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;
import vn.viettuts.quanlidangvien.controller.sinhvien;

public class viewqldv {
    private JFrame frame;
    private JTextField nameField, dobField;
    private JTable table;
    private DefaultTableModel tableModel;
    private ArrayList<sinhvien> students;

    public viewqldv() {
        students = new ArrayList<>();
        frame = new JFrame("Quản lý Đoàn viên, Đảng viên");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Khởi tạo table
        tableModel = new DefaultTableModel(new String[]{"ID", "Tên", "Ngày sinh", "Đoàn viên"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Nhập thông tin
        JPanel panel = new JPanel();
        nameField = new JTextField(15);
        dobField = new JTextField(10);
        JButton addButton = new JButton("Thêm Đoàn viên");
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addMember();
            }
        });
        
        panel.add(new JLabel("Tên:"));
        panel.add(nameField);
        panel.add(new JLabel("Ngày sinh:"));
        panel.add(dobField);
        panel.add(addButton);
        
        frame.add(panel, "North");
        frame.add(scrollPane, "Center");
        frame.setVisible(true);
    }

    private void addMember() {
        String name = nameField.getText();
        String dob = dobField.getText();
        int id = students.size() + 1; // Tăng ID tự động
        students.add(new sinhvien(id, name, dob, true));
        tableModel.addRow(new Object[]{id, name, dob, "Có"});
        nameField.setText("");
        dobField.setText("");
    }

    public static void main(String[] args) {
        new viewqldv();
    }
}

