package SIS.com.frames;

import SIS.com.objects.Student;
import SIS.Main;
import SIS.com.Write;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import java.awt.Color;
import java.awt.event.*;
import java.util.function.Predicate;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

   
    public MainWindow() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddCollegeDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameFieldC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codeFieldC = new javax.swing.JTextField();
        cancelButtonAddC = new javax.swing.JButton();
        addButtonC = new javax.swing.JButton();
        collegeCodeCheckC = new javax.swing.JLabel();
        collegeNameCheck = new javax.swing.JLabel();
        AddProgramDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        nameFieldP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codeFieldP = new javax.swing.JTextField();
        cancelButtonAddP = new javax.swing.JButton();
        addButtonP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboBoxCC = new javax.swing.JComboBox<>();
        collegeCodeCheck = new javax.swing.JLabel();
        programCodeCheck = new javax.swing.JLabel();
        programNameCheck = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        AddStudentDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        idLabel3 = new javax.swing.JLabel();
        idLabel4 = new javax.swing.JLabel();
        idLabel5 = new javax.swing.JLabel();
        idLabel6 = new javax.swing.JLabel();
        comboBoxP = new javax.swing.JComboBox<>();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        comboBoxCCStudent = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        idFieldNS = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        comboBoxYL = new javax.swing.JComboBox<>();
        comboBoxY = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        idCheck = new javax.swing.JLabel();
        firstnameCheck = new javax.swing.JLabel();
        yearLevelCheck = new javax.swing.JLabel();
        lastnameCheck = new javax.swing.JLabel();
        collegeCheck = new javax.swing.JLabel();
        programCheck = new javax.swing.JLabel();
        genderCheck = new javax.swing.JLabel();
        genderGroup = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        genderG = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jMenuItem1 = new javax.swing.JMenuItem();
        MainMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        idLabel13 = new javax.swing.JLabel();
        programCodeField = new javax.swing.JTextField();
        idLabel12 = new javax.swing.JLabel();
        yearLevelField = new javax.swing.JTextField();
        idLabel11 = new javax.swing.JLabel();
        idLabel10 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JTextField();
        idLabel9 = new javax.swing.JLabel();
        idLabel7 = new javax.swing.JLabel();
        idNumberField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        comboBoxYearL = new javax.swing.JComboBox<>();
        genderField = new javax.swing.JTextField();
        femaleG = new javax.swing.JRadioButton();
        maleG = new javax.swing.JRadioButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        comboBoxSP = new javax.swing.JComboBox<>();
        idColor = new javax.swing.JLabel();
        firstnameColor = new javax.swing.JLabel();
        lastnameColor = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxSearch = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        collegeListPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        collegeTable = new javax.swing.JTable();
        idLabel17 = new javax.swing.JLabel();
        idLabel18 = new javax.swing.JLabel();
        collegeCodeC = new javax.swing.JTextField();
        collegeCodeN = new javax.swing.JTextField();
        editCollege = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        searchFieldCollege = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        comboBoxSearchCollege = new javax.swing.JComboBox<>();
        refreshCollege = new javax.swing.JButton();
        deleteCollege = new javax.swing.JButton();
        cancelCollege = new javax.swing.JButton();
        saveCollege = new javax.swing.JButton();
        collegeName = new javax.swing.JLabel();
        collegeColor = new javax.swing.JLabel();
        programListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        programTable = new javax.swing.JTable();
        idLabel16 = new javax.swing.JLabel();
        programCodeP = new javax.swing.JTextField();
        idLabel19 = new javax.swing.JLabel();
        programCodeN = new javax.swing.JTextField();
        idLabel15 = new javax.swing.JLabel();
        collegeCodeP = new javax.swing.JTextField();
        deleteProgram = new javax.swing.JButton();
        cancelProgram = new javax.swing.JButton();
        editProgram = new javax.swing.JButton();
        saveProgram = new javax.swing.JButton();
        comboBoxCCP = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        searchProgram = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        comboBoxSearchProgram = new javax.swing.JComboBox<>();
        refreshProgram = new javax.swing.JButton();
        programColor = new javax.swing.JLabel();
        programNameColor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        SSIS = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        newProgram = new javax.swing.JMenuItem();
        neweCollege = new javax.swing.JMenuItem();

        AddCollegeDialog.setTitle("New College");
        AddCollegeDialog.setBackground(new java.awt.Color(20, 51, 37));
        AddCollegeDialog.setMaximumSize(new java.awt.Dimension(301, 300));
        AddCollegeDialog.setMinimumSize(new java.awt.Dimension(301, 300));
        AddCollegeDialog.setPreferredSize(new java.awt.Dimension(301, 300));
        AddCollegeDialog.setType(java.awt.Window.Type.UTILITY);
        AddCollegeDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(20, 51, 37));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel1.setText("College Code");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        nameFieldC.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel5.add(nameFieldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 50));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel2.setText("College Name");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        codeFieldC.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel5.add(codeFieldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, 50));

        cancelButtonAddC.setText("CANCEL");
        cancelButtonAddC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonAddCMouseClicked(evt);
            }
        });
        jPanel5.add(cancelButtonAddC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        addButtonC.setText("ADD");
        addButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonCMouseClicked(evt);
            }
        });
        jPanel5.add(addButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 80, -1));
        jPanel5.add(collegeCodeCheckC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 20));
        jPanel5.add(collegeNameCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 20));

        AddCollegeDialog.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        AddProgramDialog.setTitle("New Program");
        AddProgramDialog.setMinimumSize(new java.awt.Dimension(330, 391));
        AddProgramDialog.setModal(true);
        AddProgramDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel3.setText("Program Code");
        AddProgramDialog.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        nameFieldP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        AddProgramDialog.getContentPane().add(nameFieldP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 50));

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel4.setText("Program Name");
        AddProgramDialog.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        codeFieldP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        AddProgramDialog.getContentPane().add(codeFieldP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 250, 50));

        cancelButtonAddP.setText("CANCEL");
        cancelButtonAddP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonAddPMouseClicked(evt);
            }
        });
        AddProgramDialog.getContentPane().add(cancelButtonAddP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        addButtonP.setText("ADD");
        addButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonPMouseClicked(evt);
            }
        });
        AddProgramDialog.getContentPane().add(addButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 80, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel5.setText("College Code");
        AddProgramDialog.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        comboBoxCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AddProgramDialog.getContentPane().add(comboBoxCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 250, 50));
        AddProgramDialog.getContentPane().add(collegeCodeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 250, 20));
        AddProgramDialog.getContentPane().add(programCodeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 250, 20));
        AddProgramDialog.getContentPane().add(programNameCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 20));

        jPanel6.setBackground(new java.awt.Color(20, 51, 37));
        AddProgramDialog.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 390));

        AddStudentDialog.setTitle("New Student");
        AddStudentDialog.setBackground(new java.awt.Color(23, 58, 43));
        AddStudentDialog.setMaximumSize(new java.awt.Dimension(549, 535));
        AddStudentDialog.setMinimumSize(new java.awt.Dimension(549, 535));
        AddStudentDialog.setPreferredSize(new java.awt.Dimension(549, 535));
        AddStudentDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 51, 37));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel.setText("ID NUMBER");
        jPanel2.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 240, 60));

        idLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel1.setText("COLLEGE CODE");
        jPanel2.add(idLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 240, 40));

        idLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel2.setText("FIRST NAME");
        jPanel2.add(idLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 40));

        idLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel3.setText("LAST NAME");
        jPanel2.add(idLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 40));

        idLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel4.setText("YEAR LEVEL");
        jPanel2.add(idLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 240, 40));

        idLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel5.setText("GENDER");
        jPanel2.add(idLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 230, 50));

        idLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel6.setText("PROGRAM CODE");
        jPanel2.add(idLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 260, 40));

        comboBoxP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboBoxP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        comboBoxP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxPItemStateChanged(evt);
            }
        });
        comboBoxP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxPFocusLost(evt);
            }
        });
        jPanel2.add(comboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 240, 50));

        firstNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel2.add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 50));

        lastNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel2.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 50));

        comboBoxCCStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        comboBoxCCStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        comboBoxCCStudent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCCStudentItemStateChanged(evt);
            }
        });
        jPanel2.add(comboBoxCCStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 240, 50));

        cancelButton.setText("CANCEL");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel2.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 110, 30));

        idFieldNS.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel2.add(idFieldNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 240, 50));

        confirmButton.setText("CONFIRM");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        jPanel2.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 110, 30));

        comboBoxYL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        comboBoxYL.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel2.add(comboBoxYL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, 50));

        comboBoxY.setEditable(true);
        comboBoxY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026" }));
        comboBoxY.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        comboBoxY.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxYItemStateChanged(evt);
            }
        });
        jPanel2.add(comboBoxY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 240, 50));

        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel7.setText("ACADEMIC YEAR");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 240, 60));

        genderGroup.add(male);
        male.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        male.setSelected(true);
        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 70, 60));

        genderGroup.add(female);
        female.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        female.setText("female");
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 70, 60));
        jPanel2.add(idCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 240, 20));
        jPanel2.add(firstnameCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 20));
        jPanel2.add(yearLevelCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 20));
        jPanel2.add(lastnameCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, 20));
        jPanel2.add(collegeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 240, 20));
        jPanel2.add(programCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 240, 20));
        jPanel2.add(genderCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, 20));

        AddStudentDialog.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 540));

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");
        setMinimumSize(new java.awt.Dimension(1151, 891));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenu.setBackground(new java.awt.Color(20, 51, 37));
        MainMenu.setForeground(new java.awt.Color(153, 153, 153));
        MainMenu.setMaximumSize(new java.awt.Dimension(1151, 891));
        MainMenu.setMinimumSize(new java.awt.Dimension(1151, 891));
        MainMenu.setPreferredSize(new java.awt.Dimension(1151, 891));
        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(20, 51, 37));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 13), new java.awt.Color(255, 255, 0))); // NOI18N

        studentTable.setAutoCreateRowSorter(true);
        studentTable.setBackground(new java.awt.Color(23, 58, 43));
        studentTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        studentTable.setForeground(new java.awt.Color(153, 153, 153));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Number", "First Name", "Last Name", "Gender", "Year Level", "Program Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setFocusable(false);
        studentTable.setGridColor(new java.awt.Color(7, 27, 20));
        studentTable.setName(""); // NOI18N
        studentTable.setOpaque(false);
        studentTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        studentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentTable.getTableHeader().setResizingAllowed(false);
        studentTable.getTableHeader().setReorderingAllowed(false);
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        MainMenu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 860, 300));

        jPanel1.setBackground(new java.awt.Color(20, 51, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(260, 310));
        jPanel1.setMinimumSize(new java.awt.Dimension(260, 310));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel13.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel13.setForeground(new java.awt.Color(153, 153, 153));
        idLabel13.setText("PROGRAM CODE");
        jPanel1.add(idLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 30));

        programCodeField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        programCodeField.setForeground(new java.awt.Color(204, 204, 204));
        programCodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        programCodeField.setFocusable(false);
        jPanel1.add(programCodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 30));

        idLabel12.setBackground(new java.awt.Color(215, 243, 220));
        idLabel12.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel12.setForeground(new java.awt.Color(153, 153, 153));
        idLabel12.setText("GENDER");
        jPanel1.add(idLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        yearLevelField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        yearLevelField.setForeground(new java.awt.Color(204, 204, 204));
        yearLevelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearLevelField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        yearLevelField.setFocusable(false);
        jPanel1.add(yearLevelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 120, 30));

        idLabel11.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel11.setForeground(new java.awt.Color(153, 153, 153));
        idLabel11.setText("YEAR LEVEL");
        jPanel1.add(idLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        idLabel10.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel10.setForeground(new java.awt.Color(153, 153, 153));
        idLabel10.setText("LAST NAME");
        jPanel1.add(idLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 30));

        lastNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        lastNameLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        lastNameLabel.setFocusable(false);
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, 30));

        firstNameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        firstNameLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        firstNameLabel.setFocusable(false);
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 30));

        idLabel9.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel9.setForeground(new java.awt.Color(153, 153, 153));
        idLabel9.setText("FIRST NAME");
        jPanel1.add(idLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        idLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel7.setForeground(new java.awt.Color(153, 153, 153));
        idLabel7.setText("ID NUMBER");
        jPanel1.add(idLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        idNumberField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idNumberField.setForeground(new java.awt.Color(204, 204, 204));
        idNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idNumberField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        jPanel1.add(idNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, 30));

        editButton.setText("EDIT");
        editButton.setFocusable(false);
        editButton.setOpaque(true);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 20));

        saveButton.setText("SAVE");
        saveButton.setFocusable(false);
        saveButton.setOpaque(true);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 20));

        comboBoxYearL.setEditable(true);
        comboBoxYearL.setForeground(new java.awt.Color(215, 243, 220));
        jPanel1.add(comboBoxYearL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 120, 30));

        genderField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        genderField.setForeground(new java.awt.Color(204, 204, 204));
        genderField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        genderField.setFocusable(false);
        jPanel1.add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, 30));

        genderG.add(femaleG);
        femaleG.setForeground(new java.awt.Color(215, 243, 220));
        femaleG.setText("Female");
        jPanel1.add(femaleG, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 30));

        genderG.add(maleG);
        maleG.setForeground(new java.awt.Color(215, 243, 220));
        maleG.setSelected(true);
        maleG.setText("Male");
        jPanel1.add(maleG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, 30));

        delete.setText("DELETE");
        delete.setFocusable(false);
        delete.setOpaque(true);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, 20));

        cancel.setText("CANCEL");
        cancel.setFocusable(false);
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 20));

        comboBoxSP.setForeground(new java.awt.Color(215, 243, 220));
        comboBoxSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 30));

        idColor.setBackground(new java.awt.Color(255, 0, 0));
        idColor.setToolTipText("programcode");
        idColor.setOpaque(true);
        jPanel1.add(idColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 10, 10));

        firstnameColor.setBackground(new java.awt.Color(255, 0, 0));
        firstnameColor.setOpaque(true);
        jPanel1.add(firstnameColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 10, 10));

        lastnameColor.setBackground(new java.awt.Color(255, 0, 0));
        lastnameColor.setOpaque(true);
        jPanel1.add(lastnameColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 10, 10));

        MainMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 290, -1));

        searchField.setForeground(new java.awt.Color(204, 204, 204));
        searchField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        MainMenu.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 230, 30));

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("SEARCH");
        MainMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, 30));

        comboBoxSearch.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Number", "Firstname", "Lastname", "Year Level", "Gender", "College Code", "Program Code" }));
        comboBoxSearch.setToolTipText("");
        MainMenu.add(comboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, 20));

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("SEARCH BY:");
        MainMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, 10));

        jLabel18.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("STUDENTS LIST");
        MainMenu.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        collegeListPanel.setBackground(new java.awt.Color(20, 51, 37));
        collegeListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        collegeTable.setAutoCreateRowSorter(true);
        collegeTable.setBackground(new java.awt.Color(23, 58, 43));
        collegeTable.setForeground(new java.awt.Color(153, 153, 153));
        collegeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "College Code", "College Name"
            }
        ));
        collegeTable.setFocusable(false);
        collegeTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        collegeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collegeTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(collegeTable);

        collegeListPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 760, 120));

        idLabel17.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel17.setForeground(new java.awt.Color(153, 153, 153));
        idLabel17.setText("NAME");
        collegeListPanel.add(idLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 60, 30));

        idLabel18.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel18.setForeground(new java.awt.Color(153, 153, 153));
        idLabel18.setText("COLLEGE CODE");
        collegeListPanel.add(idLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 130, 30));

        collegeCodeC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        collegeCodeC.setForeground(new java.awt.Color(204, 204, 204));
        collegeCodeC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeC.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeC.setFocusable(false);
        collegeListPanel.add(collegeCodeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 170, 30));

        collegeCodeN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        collegeCodeN.setForeground(new java.awt.Color(204, 204, 204));
        collegeCodeN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeN.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeN.setFocusable(false);
        collegeListPanel.add(collegeCodeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 250, 30));

        editCollege.setText("EDIT");
        editCollege.setFocusable(false);
        editCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCollegeMouseClicked(evt);
            }
        });
        collegeListPanel.add(editCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, 20));

        jLabel15.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("COLLEGE LIST");
        collegeListPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        searchFieldCollege.setForeground(new java.awt.Color(204, 204, 204));
        searchFieldCollege.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null));
        searchFieldCollege.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldCollegeKeyReleased(evt);
            }
        });
        collegeListPanel.add(searchFieldCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 30));

        jLabel20.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("SEARCH");
        collegeListPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 70, 30));

        jLabel22.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("SEARCH BY:");
        collegeListPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 10));

        comboBoxSearchCollege.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxSearchCollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "College Code", "College Name" }));
        comboBoxSearchCollege.setToolTipText("");
        collegeListPanel.add(comboBoxSearchCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 20));

        refreshCollege.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        refreshCollege.setForeground(new java.awt.Color(0, 0, 0));
        refreshCollege.setText("REFRESH LIST");
        refreshCollege.setFocusable(false);
        refreshCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshCollegeMouseClicked(evt);
            }
        });
        collegeListPanel.add(refreshCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 110, 20));

        deleteCollege.setText("DELETE");
        deleteCollege.setToolTipText("Clicking delete button will set program's College Code  to none");
        deleteCollege.setFocusable(false);
        deleteCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCollegeMouseClicked(evt);
            }
        });
        collegeListPanel.add(deleteCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, 90, 20));

        cancelCollege.setText("CANCEL");
        cancelCollege.setFocusable(false);
        cancelCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelCollegeMouseClicked(evt);
            }
        });
        collegeListPanel.add(cancelCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, 20));

        saveCollege.setText("SAVE");
        saveCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveCollegeMouseClicked(evt);
            }
        });
        collegeListPanel.add(saveCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, 20));

        collegeName.setBackground(new java.awt.Color(255, 0, 0));
        collegeName.setOpaque(true);
        collegeListPanel.add(collegeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, 10, 10));

        collegeColor.setBackground(new java.awt.Color(255, 0, 0));
        collegeColor.setOpaque(true);
        collegeListPanel.add(collegeColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 10, 10));

        MainMenu.add(collegeListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 1150, 180));

        programListPanel.setBackground(new java.awt.Color(20, 51, 37));
        programListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        programTable.setAutoCreateRowSorter(true);
        programTable.setBackground(new java.awt.Color(23, 58, 43));
        programTable.setForeground(new java.awt.Color(153, 153, 153));
        programTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Program Code", "Program Name"
            }
        ));
        programTable.setFocusable(false);
        programTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        programTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(programTable);

        programListPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 760, 140));

        idLabel16.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel16.setForeground(new java.awt.Color(153, 153, 153));
        idLabel16.setText("PROGRAM CODE");
        programListPanel.add(idLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 140, 30));

        programCodeP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        programCodeP.setForeground(new java.awt.Color(204, 204, 204));
        programCodeP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        programCodeP.setFocusable(false);
        programListPanel.add(programCodeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 160, 30));

        idLabel19.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel19.setForeground(new java.awt.Color(153, 153, 153));
        idLabel19.setText("NAME");
        programListPanel.add(idLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 60, 30));

        programCodeN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        programCodeN.setForeground(new java.awt.Color(204, 204, 204));
        programCodeN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        programCodeN.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        programCodeN.setFocusable(false);
        programListPanel.add(programCodeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 250, 30));

        idLabel15.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        idLabel15.setForeground(new java.awt.Color(153, 153, 153));
        idLabel15.setText("COLLEGE CODE");
        programListPanel.add(idLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 130, 30));

        collegeCodeP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        collegeCodeP.setForeground(new java.awt.Color(204, 204, 204));
        collegeCodeP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        collegeCodeP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));
        collegeCodeP.setFocusable(false);
        programListPanel.add(collegeCodeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 170, 30));

        deleteProgram.setText("DELETE");
        deleteProgram.setToolTipText("Clicking delete button will set associated students' Program Code to 'none'");
        deleteProgram.setFocusable(false);
        deleteProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProgramMouseClicked(evt);
            }
        });
        programListPanel.add(deleteProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 90, 20));

        cancelProgram.setText("CANCEL");
        cancelProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelProgramMouseClicked(evt);
            }
        });
        programListPanel.add(cancelProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, 20));

        editProgram.setText("EDIT");
        editProgram.setFocusable(false);
        editProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProgramMouseClicked(evt);
            }
        });
        programListPanel.add(editProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, 20));

        saveProgram.setText("SAVE");
        saveProgram.setToolTipText("");
        saveProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveProgramMouseClicked(evt);
            }
        });
        programListPanel.add(saveProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, 20));

        programListPanel.add(comboBoxCCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 130, 30));

        jLabel19.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("PROGRAM LIST");
        programListPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("SEARCH");
        programListPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 70, 30));

        searchProgram.setForeground(new java.awt.Color(204, 204, 204));
        searchProgram.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null));
        searchProgram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchProgramKeyReleased(evt);
            }
        });
        programListPanel.add(searchProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 30));

        jLabel21.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("SEARCH BY:");
        programListPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, 10));

        comboBoxSearchProgram.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxSearchProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Program Code", "Program Name", "College Code" }));
        comboBoxSearchProgram.setToolTipText("");
        programListPanel.add(comboBoxSearchProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 20));

        refreshProgram.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        refreshProgram.setForeground(new java.awt.Color(0, 0, 0));
        refreshProgram.setText("REFRESH LIST");
        refreshProgram.setFocusable(false);
        refreshProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshProgramMouseClicked(evt);
            }
        });
        programListPanel.add(refreshProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 110, 20));

        programColor.setBackground(new java.awt.Color(255, 0, 0));
        programColor.setOpaque(true);
        programListPanel.add(programColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 10, 10));

        programNameColor.setBackground(new java.awt.Color(255, 0, 0));
        programNameColor.setOpaque(true);
        programListPanel.add(programNameColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, 10, 10));

        MainMenu.add(programListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1160, 190));

        jButton1.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("REFRESH LIST");
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        MainMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, -1, 20));

        jLabel14.setFont(new java.awt.Font("DejaVu Serif", 2, 36)); // NOI18N
        jLabel14.setText("SSimple");
        MainMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 160, -1));

        jLabel17.setText("v 1.0.1");
        MainMenu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 860));

        menuBar.setBackground(new java.awt.Color(7, 27, 20));
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuBar.setForeground(new java.awt.Color(215, 243, 220));
        menuBar.setMinimumSize(new java.awt.Dimension(102, 50));
        menuBar.setOpaque(true);
        menuBar.setPreferredSize(new java.awt.Dimension(102, 50));

        SSIS.setBackground(new java.awt.Color(7, 27, 20));
        SSIS.setText("NEW");
        SSIS.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N

        newStudent.setText("Student");
        newStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newStudentMouseReleased(evt);
            }
        });
        SSIS.add(newStudent);

        newProgram.setText("Program");
        newProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newProgramMouseReleased(evt);
            }
        });
        SSIS.add(newProgram);

        neweCollege.setText("College");
        neweCollege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                neweCollegeMouseReleased(evt);
            }
        });
        SSIS.add(neweCollege);

        menuBar.add(SSIS);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonAddCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonAddCMouseClicked
        AddCollegeDialog.dispose();
    }//GEN-LAST:event_cancelButtonAddCMouseClicked

    private void cancelButtonAddPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonAddPMouseClicked
        AddProgramDialog.dispose();
    }//GEN-LAST:event_cancelButtonAddPMouseClicked

    private void addButtonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonCMouseClicked
        boolean checkpoint = true;

        collegeCodeCheckC.setText("");
        collegeNameCheck.setText("");

        // Validate college code
        if (codeFieldC.getText().isBlank()) {
            checkpoint = false;
            collegeCodeCheckC.setText("* It's Empty");
        } else {
            String collegeCode = codeFieldC.getText().toLowerCase();
            if (!collegeCode.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                collegeCodeCheckC.setText("* Alphabetical Letters Only");
            } else {
                for (College college : Main.collegeData) {
                    if (Main.END.equals(college.getCollegeCode())) {
                        break;
                    }
                    if (collegeCode.equals(college.getCollegeCode().toLowerCase())) {
                        checkpoint = false;
                        collegeCodeCheckC.setText("* College Code Exists");
                    }
                }
            }
        }

        // Validate college name
        if (nameFieldC.getText().isBlank()) {
            checkpoint = false;
            collegeNameCheck.setText("* It's Empty");
        } else {
            String collegeName = nameFieldC.getText();
            if (!collegeName.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                collegeNameCheck.setText("* Alphabetical Letters Only");
            }
        }

        if (checkpoint) {
            Main.collegeData.add(new College(codeFieldC.getText(), nameFieldC.getText()));
            Write.writeCollege(); // Save to database
            loadCollegeData(); // Refresh the college table
            AddCollegeDialog.dispose();
        }
    }//GEN-LAST:event_addButtonCMouseClicked

    private void addButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonPMouseClicked
        boolean checkpoint = true;

        programCodeCheck.setText("");
        programNameCheck.setText("");
        collegeCodeCheck.setText("");

        // Validate program code
        if (codeFieldP.getText().isBlank()) {
            checkpoint = false;
            programCodeCheck.setText("* It's Empty");
        } else {
            String programCode = codeFieldP.getText().toLowerCase();
            if (!programCode.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                programCodeCheck.setText("* Alphabetical Letters Only");
            } else {
                for (Program program : Main.programData) {
                    if (Main.END.equals(program.getProgramCode())) {
                        break;
                    }
                    if (programCode.equals(program.getProgramCode().toLowerCase())) {
                        checkpoint = false;
                        programCodeCheck.setText("* Program Code Exists");
                    }
                }
            }
        }

        // Validate program name
        if (nameFieldP.getText().isBlank()) {
            checkpoint = false;
            programNameCheck.setText("* It's Empty");
        } else {
            String programName = nameFieldP.getText();
            if (!programName.matches("[a-zA-Z ]+")) {
                checkpoint = false;
                programNameCheck.setText("* Alphabetical Letters Only");
            }
        }

        // Validate college code
        String collegeCode = (String) comboBoxCC.getSelectedItem();
        if (collegeCode == null || collegeCode.isEmpty()) {
            checkpoint = false;
            collegeCodeCheck.setText("* It's Empty");
        }

        if (checkpoint) {
            Main.programData.add(new Program(codeFieldP.getText(), nameFieldP.getText(), collegeCode));
            Write.writeProgram(); // Save to database
            loadProgramData(); // Refresh the program table
            AddProgramDialog.dispose();
        }
    }//GEN-LAST:event_addButtonPMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
       
        firstNameField.setText(null);
        lastNameField.setText(null);
        comboBoxP.removeAllItems();
        AddStudentDialog.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void comboBoxPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBoxPFocusLost
        
    }//GEN-LAST:event_comboBoxPFocusLost

    private void comboBoxCCStudentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCCStudentItemStateChanged
      
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            
            if("Add New".equals((String) comboBoxCCStudent.getSelectedItem())) {
                AddCollegeDialog.setVisible(true);  
            }
            
            loadProgramCom();
       }
        
    }//GEN-LAST:event_comboBoxCCStudentItemStateChanged

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        boolean checkpoint = true;

        idCheck.setText("");
        firstnameCheck.setText("");
        lastnameCheck.setText("");
        yearLevelCheck.setText("");
        collegeCheck.setText("");
        programCheck.setText("");

        // Validate ID number
        if (idFieldNS.getText().isBlank()) {
            checkpoint = false;
            idCheck.setText("* The ID number is empty");
        } else if (!idFieldNS.getText().matches("\\d{4}-\\d{4}")) {
            checkpoint = false;
            idCheck.setText("* Format: YYYY-NNNN");
        } else {
            for (Student student : Main.studentData) {
                if (Main.END.equals(student.getIdNum())) {
                    break;
                }
                if (idFieldNS.getText().equals(student.getIdNum())) {
                    checkpoint = false;
                    idCheck.setText("* ID number is taken");
                }
            }
        }

        // Validate first name
        if (firstNameField.getText().isBlank()) {
            checkpoint = false;
            firstnameCheck.setText("* It's Empty");
        } else if (!firstNameField.getText().matches("[a-zA-Z ]+")) {
            checkpoint = false;
            firstnameCheck.setText("* Alphabetical letters only");
        }

        // Validate last name
        if (lastNameField.getText().isBlank()) {
            checkpoint = false;
            lastnameCheck.setText("* It's Empty");
        } else if (!lastNameField.getText().matches("[a-zA-Z]+")) {
            checkpoint = false;
            lastnameCheck.setText("* Alphabetical letters only");
        }

        // Validate year level
        String yearLevel = (String) comboBoxYL.getSelectedItem();
        if (yearLevel == null || yearLevel.isEmpty()) {
            checkpoint = false;
            yearLevelCheck.setText("It's Empty");
        }

        // Validate college code
        String collegeCode = (String) comboBoxCCStudent.getSelectedItem();
        if (collegeCode == null || collegeCode.isEmpty()) {
            checkpoint = false;
            collegeCheck.setText("It's Empty");
        }

        // Validate program code
        String programCode = (String) comboBoxP.getSelectedItem();
        if (programCode == null || programCode.isEmpty()) {
            checkpoint = false;
            programCheck.setText("It's Empty");
        }

        if (checkpoint) {
            Main.studentData.add(new Student(
                idFieldNS.getText(),
                firstNameField.getText(),
                lastNameField.getText(),
                yearLevel,
                male.isSelected() ? "Male" : "Female",
                programCode
            ));
            Write.writeStudent(); // Save to database
            loadStudentData(); // Refresh the student table
            AddStudentDialog.dispose();
        }
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void newStudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newStudentMouseReleased
        showStudentDialog();
    }//GEN-LAST:event_newStudentMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        //student Table Part
        saveButton.setVisible(false);
        cancel.setVisible(false);
        
        idColor.setVisible(false);
        firstnameColor.setVisible(false);
        lastnameColor.setVisible(false);
 
        
     
        comboBoxYearL.setVisible(false);
        
        //program Table part
        saveProgram.setVisible(false);
        cancelProgram.setVisible(false);
        comboBoxCCP.setVisible(false);
        
        programColor.setVisible(false);
        programNameColor.setVisible(false);
        
           
        collegeColor.setVisible(false);
        collegeName.setVisible(false);
       
        loadStudentData();
        loadCollegeData();
        loadProgramData();
    }//GEN-LAST:event_formWindowActivated

    private void newProgramMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProgramMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
        loadCollegeToProgramDialog();
    }//GEN-LAST:event_newProgramMouseReleased

    private void neweCollegeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neweCollegeMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
        AddCollegeDialog.setVisible(true);
    }//GEN-LAST:event_neweCollegeMouseReleased

    private void comboBoxYItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxYItemStateChanged
        
        if(comboBoxY.getSelectedItem() == null){
            return;
        }
        String year = (String) comboBoxY.getSelectedItem();
        if(year.length() == 4){
            String num = genNum();
            idFieldNS.setText(num);
        }
    
    }//GEN-LAST:event_comboBoxYItemStateChanged

    private void comboBoxPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxPItemStateChanged
       //this is the program comboBox in the AddStudentDialog
        if(evt.getStateChange() == ItemEvent.SELECTED){
        
            if("Add New".equals((String) comboBoxP.getSelectedItem())){
                AddProgramDialog.setVisible(false);

                loadCollegeToProgramDialog();
            }
            
           
       }
       
    }//GEN-LAST:event_comboBoxPItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        loadStudentData();
        clearStudentFields();
    }//GEN-LAST:event_jButton1MouseClicked

    private void refreshProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshProgramMouseClicked
        loadProgramData();
        clearProgramFields();
    }//GEN-LAST:event_refreshProgramMouseClicked

    private void searchProgramKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchProgramKeyReleased
        searchProgram();
    }//GEN-LAST:event_searchProgramKeyReleased

    private void saveProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveProgramMouseClicked

        //waiting popup to notify if you want to proceed to edit and the students data will also be modified
        
        boolean checkpoint = true;
        
        programColor.setVisible(false);
        programNameColor.setVisible(false);
        
        //check program Code if blank
        if(programCodeP.getText().isBlank()){
            checkpoint = false;
              programColor.setVisible(true);
              programColor.setToolTipText("It's Empty");
        } else {
            
            String programCode = programCodeP.getText().toLowerCase();
            
            if(!programCode.matches("[a-zA-Z ]+")){
                checkpoint = false;
                programColor.setVisible(true);
                programColor.setToolTipText("Alphabetical Letters Only");
          
            } else {
                
                
                int selectedRow = programTable.getSelectedRow();
                String pastProgramCode = programTable.getValueAt(selectedRow, 0).toString().toLowerCase();
                
                if(!pastProgramCode.equals(programCode)){
                    //check if programCode is unique
                    for(int i = 0; i < Main.programData.size(); i++){
        
                    if(Main.END.equals(Main.programData.get(i).getProgramCode())){
                        break;
                    }
                
                    if(programCode.equals(Main.programData.get(i).getProgramCode().toLowerCase())){
                        checkpoint = false;
                        programColor.setVisible(true);
                        programColor.setToolTipText("Program Code Exists");
                    }
                    }
          
                }
            }
            
           
            
        }
         
      
        //check program Name
        if(programCodeN.getText().isBlank()){
            checkpoint = false;
            programNameColor.setVisible(true);
            programNameColor.setToolTipText("* It's Empty");
        } else {
            
            String programName = programCodeN.getText();
            if(!programName.matches("[a-zA-Z ]+")){
               checkpoint = false;
               programNameColor.setVisible(true);
               programNameColor.setToolTipText("* Alphabetical Letters Only");
            }
            
        }
        
        
        if (checkpoint) {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to save the changes? This will also update associated students.",
                "Confirm Save",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
    
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    int selectedRow = programTable.getSelectedRow();
                    String oldProgramCode = (String) programTable.getValueAt(selectedRow, 0);
    
                    saveProgram.setVisible(false);
                    cancelProgram.setVisible(false);
                    comboBoxCCP.setVisible(false);
    
                    editProgram.setVisible(true);
                    deleteProgram.setVisible(true);
                    collegeCodeP.setVisible(true);
    
                    programCodeP.setFocusable(false);
                    programCodeN.setFocusable(false);
                    collegeCodeP.setFocusable(false);
    
                    SSIS.setEnabled(true);
                    saveProgramEdit();
    
                    Write.updateProgram(oldProgramCode, programCodeP.getText(), programCodeN.getText(), (String) comboBoxCCP.getSelectedItem()); // Update the database
                    Write.writeStudent();
    
                    clearProgramFields();
                    clearStudentFields();
    
                    loadProgramData();
                    loadStudentData();
    
                    JOptionPane.showMessageDialog(this, "Program updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error updating program: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
      
    }//GEN-LAST:event_saveProgramMouseClicked

    private void editProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProgramMouseClicked

        if(!programCodeP.getText().isEmpty()){
            editProgram.setVisible(false);
            deleteProgram.setVisible(false);

            saveProgram.setVisible(true);
            cancelProgram.setVisible(true);

            programCodeP.setFocusable(true);
            programCodeN.setFocusable(true);
            collegeCodeP.setFocusable(true);

            collegeCodeP.setVisible(false);
            comboBoxCCP.setVisible(true);

            //loadthe college data
            comboBoxCCP.removeAllItems();
            for(int i = 0; i < Main.collegeData.size(); i++){
                if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                    break;
                }
                comboBoxCCP.addItem(Main.collegeData.get(i).getCollegeCode());

            }
        }

    }//GEN-LAST:event_editProgramMouseClicked

    private void cancelProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelProgramMouseClicked

        programColor.setVisible(false);
        programNameColor.setVisible(false);
        
        cancelProgram.setVisible(false);
        saveProgram.setVisible(false);
        comboBoxCCP.setVisible(false);

        editProgram.setVisible(true);
        deleteProgram.setVisible(true);
        collegeCodeP.setVisible(true);
         SSIS.setEnabled(true);
        
        programCodeP.setFocusable(false);
        programCodeN.setFocusable(false);
        collegeCodeP.setFocusable(false);

        getProgramTableRowData();

    }//GEN-LAST:event_cancelProgramMouseClicked

    private void deleteProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProgramMouseClicked
        String programCode = programCodeP.getText();

        if (programCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a program to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
            "Deleting this program will set associated students' Program Code to 'none'.\nAre you sure you want to proceed?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            // Remove the program from the list
            Main.programData.removeIf(program -> program.getProgramCode().equals(programCode));
            Write.writeProgram(); // Update the database

            // Update associated students
            for (Student student : Main.studentData) {
                if (student.getProgramCode().equals(programCode)) {
                    student.setProgramCode("none");
                }
            }
            Write.writeStudent(); // Update the database

            // Refresh the data
            loadProgramData();
            loadStudentData();
            clearProgramFields();

            JOptionPane.showMessageDialog(this, "Program deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteProgramMouseClicked

    private void programTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programTableMouseClicked
        getProgramTableRowData();
    }//GEN-LAST:event_programTableMouseClicked

    private void refreshCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCollegeMouseClicked
        loadCollegeData();
        clearCollegeFields();
    }//GEN-LAST:event_refreshCollegeMouseClicked

    private void collegeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegeTableMouseClicked
        getCollegeTableRowData();
    }//GEN-LAST:event_collegeTableMouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        searchStudent();
    }//GEN-LAST:event_searchFieldKeyReleased

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked


        
        idColor.setVisible(false);
        firstnameColor.setVisible(false);
        lastnameColor.setVisible(false);

        
        
        saveButton.setEnabled(false);
        cancel.setEnabled(false);
        saveButton.setVisible(false);

        delete.setVisible(true);
        editButton.setVisible(true);
        saveButton.setVisible(false);

        studentTable.setFocusable(true);
        studentTable.setEnabled(true);
        SSIS.setEnabled(true);

        idNumberField.setFocusable(false);
        firstNameLabel.setFocusable(false);
        lastNameLabel.setFocusable(false);
        yearLevelField.setFocusable(false);
        genderField.setFocusable(false);
        programCodeField.setFocusable(false);

        programCodeField.setVisible(true);
        yearLevelField.setVisible(true);
        genderField.setVisible(true);

        comboBoxSP.setVisible(false);
        comboBoxYearL.setVisible(false);
        maleG.setVisible(false);
        femaleG.setVisible(false);

        idColor.setOpaque(false);
        
        
        
        getStudentTableRowData();

    }//GEN-LAST:event_cancelMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        String idNumber = idNumberField.getText();

        if (idNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete this student?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            // Remove the student from the list
            Main.studentData.removeIf(student -> student.getIdNum().equals(idNumber));
            Write.writeStudent(); // Update the database

            // Refresh the data
            loadStudentData();
            clearStudentFields();

            JOptionPane.showMessageDialog(this, "Student deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked

        boolean checkpoint = true;
  
        idColor.setVisible(false);
        firstnameColor.setVisible(false);
        lastnameColor.setVisible(false);
    
        
          //unique id check
        if(idNumberField.getText().isBlank()){
            checkpoint = false;
         
            
        } else {
            
            if(!idNumberField.getText().matches("\\d{4}-\\d{4}")){
                checkpoint = false;
                idColor.setVisible(true);
             
            } else {
   
                if(idNumberField.getText().length() == 9){
            
                    int selectedRow = studentTable.getSelectedRow();
                    String pastIdNum = (String) studentTable.getValueAt(selectedRow, 0);
                    
                    if(!pastIdNum.equals(idNumberField.getText())){
                        for(int i = 0; i < Main.studentData.size(); i++){
                        if(Main.END.equals(Main.studentData.get(i).getIdNum())){
                            break;
                        }
            
                        if(idNumberField.getText().equals(Main.studentData.get(i).getIdNum())){
                            checkpoint = false;
                            idColor.setVisible(true);
                   
                        }
                        }   
                    }
                   
                
                }
            }
            
        }
        
          //--------------------------------------------------------------------------

        //first name check
        if(firstNameLabel.getText().isBlank()){
            checkpoint = false;
            firstnameColor.setVisible(true);
           
        } else {
            String firstname = firstNameLabel.getText();
            if(!firstname.matches("[a-zA-Z ]+")){
               checkpoint = false;
               firstnameColor.setVisible(true);
           
            } 
        }
     
       
        //--------------------------------------------------------------------------
  
        
        //lastname check
        if(lastNameLabel.getText().isBlank()){
            checkpoint = false;
                lastnameColor.setVisible(true);
        } else {
            String lastname = lastNameLabel.getText();
            if(!lastname.matches("[a-zA-Z]+")){
                checkpoint = false;
                lastnameColor.setVisible(true);
            }
        }
       
  
        
        
        
        
        //firstname and lastname check
        if(firstNameLabel.getText().isBlank() && lastNameLabel.getText().isBlank()){
            checkpoint = false;
        } else {
            
 
            String firstname = firstNameLabel.getText().toLowerCase();
            String lastname = lastNameLabel.getText().toLowerCase();
            
            int selectedRow = studentTable.getSelectedRow();
            String pastFirstname = studentTable.getValueAt(selectedRow, 1).toString().toLowerCase();
            String pastLastname = studentTable.getValueAt(selectedRow, 2).toString().toLowerCase();
            
            //check if same from past and current name
            if(!pastFirstname.equals(firstname) && !pastLastname.equals(lastname)){
                for(int i = 0; i < Main.studentData.size(); i++){
                    if(Main.END.equals(Main.studentData.get(i).getIdNum())){
                        break;
                    }
                    //check if unique
                    if(firstname.equals(Main.studentData.get(i).getFirstName().toLowerCase()) && lastname.equals(Main.studentData.get(i).getLastName().toLowerCase())){
                        checkpoint = false;
                        firstnameColor.setVisible(true);
                        lastnameColor.setVisible(true);
                    }
                }
            }

        }
       
        
        if (checkpoint) {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to save the changes?",
                "Confirm Save",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
    
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    int selectedRow = studentTable.getSelectedRow();
                    String oldIdNumber = (String) studentTable.getValueAt(selectedRow, 0);
    
                    delete.setVisible(true);
                    editButton.setVisible(true);
                    saveButton.setVisible(false);
                    cancel.setVisible(false);
    
                    studentTable.setFocusable(true);
                    studentTable.setEnabled(true);
                    SSIS.setEnabled(true);
    
                    idNumberField.setFocusable(false);
                    firstNameLabel.setFocusable(false);
                    lastNameLabel.setFocusable(false);
                    yearLevelField.setFocusable(false);
                    genderField.setFocusable(false);
                    programCodeField.setFocusable(false);
    
                    programCodeField.setVisible(true);
                    yearLevelField.setVisible(true);
                    genderField.setVisible(true);
    
                    comboBoxSP.setVisible(false);
                    comboBoxYearL.setVisible(false);
                    maleG.setVisible(false);
                    femaleG.setVisible(false);
    
                    saveStudentEdit();
                    Write.updateStudent(oldIdNumber, idNumberField.getText(), firstNameLabel.getText(), lastNameLabel.getText(),
                        (String) comboBoxYearL.getSelectedItem(), maleG.isSelected() ? "Male" : "Female", (String) comboBoxSP.getSelectedItem()); // Update the database
    
                    Student.sortStudentArray();
                    clearStudentFields();
    
                    loadStudentData();
    
                    JOptionPane.showMessageDialog(this, "Student updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error updating student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked

        if(!idNumberField.getText().isEmpty()){
            editButton.setVisible(false);
            delete.setVisible(false);
            
            saveButton.setVisible(true);
            cancel.setVisible(true);
            
            studentTable.setFocusable(false);
            studentTable.setEnabled(false);
            SSIS.setEnabled(false);

    
            idNumberField.setFocusable(true);
            firstNameLabel.setFocusable(true);
            lastNameLabel.setFocusable(true);
            yearLevelField.setFocusable(true);
            genderField.setFocusable(true);
            programCodeField.setVisible(false);
            yearLevelField.setVisible(false);
            genderField.setVisible(false);

            comboBoxSP.setVisible(true);
            comboBoxYearL.setVisible(true);
            maleG.setVisible(true);
            femaleG.setVisible(true);

            //load Academic Year
            comboBoxYearL.removeAllItems();
            for(int i = 0; i < Main.YearLevel.length; i++){

                if(Main.YearLevel[i] == null){
                    break;
                }

                comboBoxYearL.addItem(Main.YearLevel[i]);
            }

            comboBoxSP.removeAllItems();
            for(int i = 0; i < Main.programData.size(); i++){

                if(Main.END.equals(Main.programData.get(i).getProgramCode())){
                    break;
                }

                comboBoxSP.addItem(Main.programData.get(i).getProgramCode());
            }
        }

    }//GEN-LAST:event_editButtonMouseClicked

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        getStudentTableRowData();
    }//GEN-LAST:event_studentTableMouseClicked

    private void deleteCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCollegeMouseClicked
        String collegeCode = collegeCodeC.getText();

        if (collegeCode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a college to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
            "Deleting this college will set associated programs' College Code to 'none'.\nAre you sure you want to proceed?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            // Remove the college from the list
            Main.collegeData.removeIf(college -> college.getCollegeCode().equals(collegeCode));
            Write.writeCollege(); // Update the database

            // Update associated programs
            for (Program program : Main.programData) {
                if (program.getCollegeCode().equals(collegeCode)) {
                    program.setCollegeCode("none");
                }
            }
            Write.writeProgram(); // Update the database

            // Refresh the data
            loadCollegeData();
            loadProgramData();
            clearCollegeFields();

            JOptionPane.showMessageDialog(this, "College deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteCollegeMouseClicked

    private void saveCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveCollegeMouseClicked
        
        //waiting popup to notify if you want to proceed to save the modification, the program list will also be modified

        
         boolean checkpoint = true;

        
        collegeColor.setVisible(false);
        collegeName.setVisible(false);
        
          //check college Code if blank
        if(collegeCodeC.getText().isBlank()){
            checkpoint = false;
             collegeColor.setVisible(true);
             collegeColor.setToolTipText("It's Empty");
        } else {
            
            String collegeCode = collegeCodeC.getText().toLowerCase();
            
            if(!collegeCode.matches("[a-zA-Z ]+")){
                checkpoint = false;
                collegeColor.setVisible(true);
                collegeColor.setToolTipText("Alphabetical Letters Only");
          
            } else {
                
                int selectedRow = collegeTable.getSelectedRow();
                String pastCollegeCode = collegeTable.getValueAt(selectedRow, 0).toString().toLowerCase();
                
                if(!pastCollegeCode.equals(collegeCode)){
                      //check if programCode is unique
                for(int i = 0; i < Main.collegeData.size(); i++){
        
                if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                    break;
                }
                
                if(collegeCode.equals(Main.collegeData.get(i).getCollegeCode().toLowerCase())){
                    checkpoint = false;
                    collegeColor.setVisible(true);
                    collegeColor.setToolTipText("College Code Exists");
                }
        
                }

                }
                          }
 
        }
        
        //college name check
        if(collegeCodeN.getText().isBlank()){
            checkpoint = false;
              collegeName.setVisible(true);
              collegeName.setToolTipText("It's Empty");
        } else {
            
            String collegeNameC = collegeCodeN.getText();
            if(!collegeNameC.matches("[a-zA-Z ]+")){
                checkpoint = false;
                collegeName.setVisible(true);
                collegeName.setToolTipText("Alphabetical Letters Only");
            }
            
        }
        
        
        
        if (checkpoint) {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to save the changes? This will also update associated programs.",
                "Confirm Save",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
    
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    saveCollege.setVisible(false);
                    cancelCollege.setVisible(false);
    
                    editCollege.setVisible(true);
                    deleteCollege.setVisible(true);
    
                    collegeCodeC.setFocusable(false);
                    collegeCodeN.setFocusable(false);
    
                    SSIS.setEnabled(true);
                    collegeTable.setEnabled(true);
                    collegeTable.setFocusable(true);
    
                    saveCollegeEdit();
                    int selectedRow = collegeTable.getSelectedRow();
                    String oldCollegeCode = (String) collegeTable.getValueAt(selectedRow, 0);
    
                    Write.updateCollege(oldCollegeCode, collegeCodeC.getText(), collegeCodeN.getText()); // Update the database
                    Write.writeProgram();
    
                    clearCollegeFields();
                    clearProgramFields();
    
                    loadProgramData();
                    loadCollegeData();
    
                    JOptionPane.showMessageDialog(this, "College updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error updating college: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
      
    }//GEN-LAST:event_saveCollegeMouseClicked

    private void editCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCollegeMouseClicked
       
        if(!collegeCodeC.getText().isEmpty()){
            
            editCollege.setVisible(false);
            deleteCollege.setVisible(false);

            saveCollege.setVisible(true);
            cancelCollege.setVisible(true);

            collegeTable.setFocusable(false);
            collegeTable.setEnabled(false);
            SSIS.setEnabled(false);

            collegeCodeC.setEditable(true);
            collegeCodeC.setFocusable(true);

            collegeCodeN.setEditable(true);
            collegeCodeN.setFocusable(true);

        }
    }//GEN-LAST:event_editCollegeMouseClicked

    private void cancelCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelCollegeMouseClicked
        
           
        collegeColor.setVisible(false);
        collegeName.setVisible(false);
        cancelCollege.setVisible(false);
        saveCollege.setVisible(false);

        editCollege.setVisible(true);
        deleteCollege.setVisible(true);
        SSIS.setEnabled(true);
        
        collegeCodeC.setFocusable(false);
        collegeCodeN.setFocusable(false);
        getCollegeTableRowData();
    }//GEN-LAST:event_cancelCollegeMouseClicked

    private void searchFieldCollegeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldCollegeKeyReleased
        searchCollege();
    }//GEN-LAST:event_searchFieldCollegeKeyReleased

    
    public static void showStudentDialog(){
        AddStudentDialog.setLocationByPlatform(true);
        
        //add the items for Year Level
        comboBoxYL.removeAllItems();
        comboBoxYL.addItem("");
        for(int i = 0; i < Main.YearLevel.length; i++){
            if(Main.YearLevel[i] == null){
                break;
            }
            comboBoxYL.addItem(Main.YearLevel[i]);
        }
        //-----------------
        
        //add the items for College Code
        loadCollegeCom();
        
        //add the items for Academic Year
        comboBoxY.removeAllItems();
        for(int i = 0; i < Main.Years.length; i++){
         
            if(Main.Years[i] == null){
                break;
            }
            
            comboBoxY.addItem(Main.Years[i]);
        }
        //----------------------
        
        //generate number
        String num = genNum();
        idFieldNS.setText(num);
        
        AddStudentDialog.setVisible(true);
    }
    
    
    
    public static void loadCollegeToProgramDialog(){
        //load all available college code in the comboBox
        comboBoxCC.removeAllItems();
        
        for(int i = 0; i < Main.collegeData.size(); i++){
            if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                break;
            }
             comboBoxCC.addItem(Main.collegeData.get(i).getCollegeCode());
        }
        AddProgramDialog.setVisible(true);
    }
    
    public static void loadProgramCom() {
        comboBoxP.removeAllItems();
        comboBoxP.addItem("");
        for (Program program : Main.programData) {
            if (!Main.END.equals(program.getProgramCode())) {
                comboBoxP.addItem(program.getProgramCode());
            }
        }
        comboBoxP.addItem("Add New");
    }
    
    public static void loadCollegeCom() {
        comboBoxCCStudent.removeAllItems();
        comboBoxCCStudent.addItem("");
        for (College college : Main.collegeData) {
            if (!Main.END.equals(college.getCollegeCode())) {
                comboBoxCCStudent.addItem(college.getCollegeCode());
            }
        }
        comboBoxCCStudent.addItem("Add New");
    }
    
//-------------------------------------------------------------------------------------------
   public static void clearStudentFields(){
       

       idNumberField.setText("");
       firstNameLabel.setText("");
       lastNameLabel.setText("");
       yearLevelField.setText("");
       genderField.setText("");
       programCodeField.setText("");
   }
//-------------------------------------------------------------------------------------------
   
   public static void clearProgramFields(){
       
       programCodeP.setText("");
       programCodeN.setText("");
       collegeCodeP.setText("");
   }
//-------------------------------------------------------------------------------------------
   public static void clearCollegeFields(){
       
       collegeCodeC.setText("");
       collegeCodeN.setText("");
   }
   
    
//-------------------------------------------------------------------------------------------
   public static void searchStudent(){
       
       
           
           String filter = (String) comboBoxSearch.getSelectedItem();
           String search = searchField.getText();
           
           
           if(filter.equals("ID Number")){
               FilteredStudentData(s -> s.getIdNum().toLowerCase().contains(search.toLowerCase()));
           }

           if(filter.equals("Firstname")){
               FilteredStudentData(s -> s.getFirstName().toLowerCase().contains(search.toLowerCase()));
           }
           
           if(filter.equals("Lastname")){
               FilteredStudentData(s -> s.getLastName().toLowerCase().contains(search.toLowerCase()));
           }
           
           if(filter.equals("Year Level")){
               FilteredStudentData(s -> s.getYearLevel().toLowerCase().contains(search.toLowerCase()));
           }
           
           if(filter.equals("Gender")){
               FilteredStudentData(s -> s.getGender().toLowerCase().contains(search.toLowerCase()));
           }
           
           if(filter.equals("Program Code")){
               FilteredStudentData(s -> s.getProgramCode().toLowerCase().contains(search.toLowerCase()));
           }
          
           
       
      
       
    
}
//-------------------------------------------------------------------------------------------
    
   public static void searchProgram(){
       
        
       if(searchProgram.getText().length() > 0){
           
           
           String filter = (String) comboBoxSearchProgram.getSelectedItem();
           String search = searchProgram.getText();
           
           if(filter.equals("Program Code")){
               filteredProgramData(s -> s.getProgramCode().toLowerCase().contains(search.toLowerCase()));
           }
           
           if(filter.equals("Program Name")){
               filteredProgramData(s -> s.getProgramName().toLowerCase().contains(search.toLowerCase()));
           }

           if(filter.equals("College Code")){
               filteredProgramData(s -> s.getCollegeCode().toLowerCase().contains(search.toLowerCase()));
           }


           
           
       } else {
           loadProgramData();
       }
                  
       
       
       
   }
 //-------------------------------------------------------------------------------------------
   
   public static void searchCollege(){
       
        if(searchFieldCollege.getText().length() > 0){
           
           
           String filter = (String) comboBoxSearchCollege.getSelectedItem();
           String search = searchFieldCollege.getText();
           
           if(filter.equals("College Code")){
               filteredCollegeData(s -> s.getCollegeCode().toLowerCase().contains(search.toLowerCase()));
           }
           
           if(filter.equals("College Name")){
               filteredCollegeData(s -> s.getCollegeName().toLowerCase().contains(search.toLowerCase()));
           }
        
       } else {
           loadCollegeData();
       }
      
       
   }
   
   
//This method is for loading Student Data's to the JTable
//-------------------------------------------------------------------------------------------
    public static void loadDataToStudentTable(Object[][] data){
    
        studentTable.getTableHeader().setResizingAllowed(false);
        studentTable.getTableHeader().setReorderingAllowed(false);
        studentTable.setCellSelectionEnabled(false);
        studentTable.setRowSelectionAllowed(true);
        studentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     
        // [FORMAT]: IdNum/Firstname/Lastname/YearLevel/Gender/CollegeCode/ProgramCode
        String studentFormat[] = { "ID Number", "First Name", "Last Name", "Year Level", "Gender", "Program Code"};
  
        
        
        DefaultTableModel model = new DefaultTableModel(data, studentFormat);
        studentTable.setModel(model);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        studentTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        studentTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        studentTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        studentTable.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        //Color
      
        studentTable.getTableHeader().setBackground(Color.DARK_GRAY);

        studentTable.getTableHeader().setForeground(Color.BLACK);
        //make the cell not selectable
        studentTable.setDefaultEditor(Object.class, null);
        
        getStudentTableRowData();
}    
//-------------------------------------------------------------------------------------------

    public static void loadStudentData(){
        
        int count = 0;
        while(count < Main.studentData.size()){
            if(Main.END.equals(Main.studentData.get(count).getIdNum())){
                break;
            }
            count++;
        }
        
        Object[][] studentData = new Object[count][Main.STUDENTDATA_FORMAT];
 
        for(int i = 0; i <  Main.studentData.size(); i++){
            
          
            if(Main.END.equals(Main.studentData.get(i).getIdNum())){
                break;
            }
            
            studentData[i][0] = Main.studentData.get(i).getIdNum();
            studentData[i][1] = Main.studentData.get(i).getFirstName();
            studentData[i][2] = Main.studentData.get(i).getLastName();
            studentData[i][3] = Main.studentData.get(i).getYearLevel();
            studentData[i][4] = Main.studentData.get(i).getGender();
            studentData[i][5] = Main.studentData.get(i).getProgramCode();
            
        
        }
        
        loadDataToStudentTable(studentData);
    }
//-------------------------------------------------------------------------------------------  
    
    public static void FilteredStudentData(Predicate<Student> filter) {
        int count = 0;
        while (count < Main.studentData.size()) {
            if (Main.END.equals(Main.studentData.get(count).getIdNum())) {
                break;
            }
            count++;
        }

        Object[][] studentData = new Object[count][Main.STUDENTDATA_FORMAT];
        int dataIndex = 0; // Index for studentData array

        for (int i = 0; i < Main.studentData.size(); i++) {
            if (Main.END.equals(Main.studentData.get(i).getIdNum())) {
                break;
            }

            // Apply the filter (if provided)
            if (filter == null || filter.test(Main.studentData.get(i))) {
                studentData[dataIndex][0] = Main.studentData.get(i).getIdNum();
                studentData[dataIndex][1] = Main.studentData.get(i).getFirstName();
                studentData[dataIndex][2] = Main.studentData.get(i).getLastName();
                studentData[dataIndex][3] = Main.studentData.get(i).getYearLevel();
                studentData[dataIndex][4] = Main.studentData.get(i).getGender();
                studentData[dataIndex][5] = Main.studentData.get(i).getProgramCode();
                dataIndex++;
            }
        }

        // Resize the array to remove empty rows (if any)
        Object[][] finalStudentData = new Object[dataIndex][Main.STUDENTDATA_FORMAT];
        System.arraycopy(studentData, 0, finalStudentData, 0, dataIndex);

        loadDataToStudentTable(finalStudentData);
    }

    
//-------------------------------------------------------------------------------------------    
    
    
//-------------------------------------------------------------------------------------------
    public static void loadToCollegeTable(Object[][] college){
        
        collegeTable.getTableHeader().setResizingAllowed(false);
        collegeTable.getTableHeader().setReorderingAllowed(false);
 
        collegeTable.setCellSelectionEnabled(false);
        collegeTable.setRowSelectionAllowed(true);
        collegeTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
       // [FORMAT]: Code/Name
        String collegeFormat[] = {"College Code", "College Name"};
        
        
        DefaultTableModel model = new DefaultTableModel(college, collegeFormat);
        collegeTable.setModel(model);
       
           
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        collegeTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
      
        collegeTable.getTableHeader().setBackground(Color.DARK_GRAY);

        collegeTable.getTableHeader().setForeground(Color.BLACK);
        
        
        
        //make the cell not selectable
        collegeTable.setDefaultEditor(Object.class, null);
        
    }
    
//-------------------------------------------------------------------------------------------
    
    public static void loadCollegeData(){
        
          //load the collegetData
       
        int count = 0;
        while(count < Main.collegeData.size()){
            if(Main.END.equals(Main.collegeData.get(count).getCollegeCode())){
                break;
            }
            count++;
        }
       
        
        Object[][] collegeData = new Object[count][Main.COLLEGEDATA_FORMAT];
 
        for(int i = 0; i <  Main.collegeData.size(); i++){
            
          
            if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                break;
            }
            
           collegeData[i][0] = Main.collegeData.get(i).getCollegeCode();
           collegeData[i][1] = Main.collegeData.get(i).getCollegeName();             
                  
        }
        
        loadToCollegeTable(collegeData);
    }
    
//-------------------------------------------------------------------------------------------
    
     public static void filteredCollegeData(Predicate<College> filter) {
        int count = 0;
        while (count < Main.collegeData.size()) {
            if (Main.END.equals(Main.collegeData.get(count).getCollegeCode())) {
                break;
            }
            count++;
        }

        Object[][] collegeData = new Object[count][Main.COLLEGEDATA_FORMAT];
        int dataIndex = 0; // Index for studentData array

        for (int i = 0; i < Main.collegeData.size(); i++) {
            if (Main.END.equals(Main.collegeData.get(i).getCollegeCode())) {
                break;
            }

            // Apply the filter (if provided)
            if (filter == null || filter.test(Main.collegeData.get(i))) {
                collegeData[dataIndex][0] = Main.collegeData.get(i).getCollegeCode();
                collegeData[dataIndex][1] = Main.collegeData.get(i).getCollegeName();
                dataIndex++;
            }
        }

        // Resize the array to remove empty rows (if any)
        Object[][] finalCollegeData = new Object[dataIndex][Main.COLLEGEDATA_FORMAT];
        System.arraycopy(collegeData, 0, finalCollegeData, 0, dataIndex);

        loadToCollegeTable(finalCollegeData);
    }
    
//-------------------------------------------------------------------------------------------
    
    public static void loadToProgramTable(Object[][] program){
        
        programTable.getTableHeader().setResizingAllowed(false);
        programTable.getTableHeader().setReorderingAllowed(false);
 
        programTable.setCellSelectionEnabled(false);
        programTable.setRowSelectionAllowed(true);
        programTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
        // [FORMAT]: Program Code/Name/College code
        String programFormat[] = {"Program Code", "Program Name", "College Code"};
        
        DefaultTableModel model = new DefaultTableModel(program, programFormat);
        programTable.setModel(model);
        
                   
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        programTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        programTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        
        programTable.getTableHeader().setBackground(Color.DARK_GRAY);

        programTable.getTableHeader().setForeground(Color.black);
        
        //make the cell not selectable
        programTable.setDefaultEditor(Object.class, null);
        
        
    }
    
//-------------------------------------------------------------------------------------------
    
    public static void loadProgramData(){
          //load the collegetData
        

        int count = 0;
        while(count < Main.programData.size()){
            if(Main.END.equals(Main.programData.get(count).getProgramCode())){
                break;
            }
            count++;
        }
        
     
     
        
        Object[][] programData = new Object[count][Main.PROGRAMDATA_FORMAT];
 
        for(int i = 0; i <  Main.programData.size(); i++){
            
          
            if(Main.END.equals(Main.programData.get(i).getProgramCode())){
                break;
            }
            
           programData[i][0] = Main.programData.get(i).getProgramCode();
           programData[i][1] = Main.programData.get(i).getProgramName();   
           programData[i][2] = Main.programData.get(i).getCollegeCode();
                  
        }
        
        loadToProgramTable(programData);
    }
   public static void filteredProgramData(Predicate<Program> filter) {
        int count = 0;
        while (count < Main.programData.size()) {
            if (Main.END.equals(Main.programData.get(count).getProgramCode())) {
                break;
            }
            count++;
        }

        Object[][] programData = new Object[count][Main.PROGRAMDATA_FORMAT];
        int dataIndex = 0; // Index for studentData array

        for (int i = 0; i < Main.programData.size(); i++) {
            if (Main.END.equals(Main.programData.get(i).getProgramCode())) {
                break;
            }

            // Apply the filter (if provided)
            if (filter == null || filter.test(Main.programData.get(i))) {
                programData[dataIndex][0] = Main.programData.get(i).getProgramCode();
                programData[dataIndex][1] = Main.programData.get(i).getProgramName();
                programData[dataIndex][2] = Main.programData.get(i).getCollegeCode();
                dataIndex++;
            }
        }

        // Resize the array to remove empty rows (if any)
        Object[][] finalProgramData = new Object[dataIndex][Main.PROGRAMDATA_FORMAT];
        System.arraycopy(programData, 0, finalProgramData, 0, dataIndex);

        loadToProgramTable(finalProgramData);
    }
    
//-------------------------------------------------------------------------------------------
    public static void getStudentTableRowData(){
        
        if(studentTable.getRowCount() == 1){
            studentTable.setRowSelectionInterval(0, 0);
        }
        
         //get the row data to load in the individual label
        int selectedRow = studentTable.getSelectedRow();
        
      
        if(selectedRow != -1){
            
       
            idNumberField.setText( (String) studentTable.getValueAt(selectedRow, 0));
            firstNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 1));
            lastNameLabel.setText( (String) studentTable.getValueAt(selectedRow, 2));
            yearLevelField.setText( (String) studentTable.getValueAt(selectedRow, 3));
            genderField.setText( (String) studentTable.getValueAt(selectedRow, 4));
            programCodeField.setText( (String) studentTable.getValueAt(selectedRow, 5));
        }
        
    }

//-------------------------------------------------------------------------------------------    

    
    public static void getProgramTableRowData(){
        
        if(programTable.getRowCount() == 1){
            programTable.setRowSelectionInterval(0, 0);
        }
        
        int selectedRow = programTable.getSelectedRow();
        
        if(selectedRow != -1){
            
       
            
            programCodeP.setText( (String) programTable.getValueAt(selectedRow, 0));
            programCodeN.setText((String) programTable.getValueAt(selectedRow, 1));
            collegeCodeP.setText((String) programTable.getValueAt(selectedRow, 2));
            
        }
        
        
    }
    
//-------------------------------------------------------------------------------------------
        
    public static void getCollegeTableRowData(){
        
        if(collegeTable.getRowCount() == 1){
            collegeTable.setRowSelectionInterval(0, 0);
        }
        
        int selectedRow = collegeTable.getSelectedRow();
        
        if(selectedRow != -1){
           
            collegeCodeC.setText( (String) collegeTable.getValueAt(selectedRow, 0));
            collegeCodeN.setText((String) collegeTable.getValueAt(selectedRow, 1));
           
        }
        
        
    }
//-------------------------------------------------------------------------------------------
    public static void saveStudentEdit(){
    
        
        for(int i = 0; i < Main.studentData.size(); i++){
            
            if(Main.END.equals(Main.studentData.get(i).getIdNum())){
                break;
            }
            
            int selectedRow = studentTable.getSelectedRow();
            String pastIdNum = (String) studentTable.getValueAt(selectedRow, 0);
            
            if(pastIdNum.equals(Main.studentData.get(i).getIdNum())){
                
                Main.studentData.get(i).setIdNum(idNumberField.getText());
                Main.studentData.get(i).setFirstName(firstNameLabel.getText());
                Main.studentData.get(i).setLastName(lastNameLabel.getText());
                Main.studentData.get(i).setYearLevel( (String) comboBoxYearL.getSelectedItem());
                
                if(maleG.isSelected()){
                      Main.studentData.get(i).setGender(maleG.getText());
                }
                if(femaleG.isSelected()){
                      Main.studentData.get(i).setGender(femaleG.getText());
                }
             
                Main.studentData.get(i).setProgramCode( (String) comboBoxSP.getSelectedItem());
               
            }
            
        }
   
}
//-----------------------------------------------------------------------------------------------------   
    
    public static void saveProgramEdit(){
        
        
        //checkpoints
        
        
        int temp = programTable.getSelectedRow();
        String pastProgramCode = (String) programTable.getValueAt(temp, 0);
       
        for(int i = 0; i < Main.programData.size(); i++){
            
            if(Main.END.equals(Main.programData.get(i).getProgramCode())){
                break;
            }
            
            if(pastProgramCode.equals((Main.programData.get(i).getProgramCode()))){
                Main.programData.get(i).setProgramCode(programCodeP.getText());
                Main.programData.get(i).setProgramName(programCodeN.getText());
                Main.programData.get(i).setCollegeCode( (String) comboBoxCCP.getSelectedItem());
            }
        }
        
        
        //modify also the students data
        for(int i = 0; i < Main.studentData.size(); i++){
            
            if (Main.END.equals(Main.studentData.get(i).getIdNum())) {
                break;
            }
            
            if(pastProgramCode.equals(Main.studentData.get(i).getProgramCode())){
                Main.studentData.get(i).setProgramCode(programCodeP.getText());
            }
            
        }
        
    }
    
//-----------------------------------------------------------------------------------------------------
    
      public static void saveCollegeEdit(){
        
        
        //checkpoints
        
        
        int temp = collegeTable.getSelectedRow();
        String pastCollegeCode = (String) collegeTable.getValueAt(temp, 0);
       
        for(int i = 0; i < Main.collegeData.size(); i++){
            
            if(Main.END.equals(Main.collegeData.get(i).getCollegeCode())){
                break;
            }
            
            if(pastCollegeCode.equals((Main.collegeData.get(i).getCollegeCode()))){
                Main.collegeData.get(i).setCollegeCode(collegeCodeC.getText());
                Main.collegeData.get(i).setCollegeName(collegeCodeN.getText());
            }
        }
        
        
        //modify also the Program data
        for(int i = 0; i < Main.programData.size(); i++){
            
            if (Main.END.equals(Main.programData.get(i).getProgramCode())) {
                break;
            }
            
            if(pastCollegeCode.equals(Main.programData.get(i).getCollegeCode())){
                Main.programData.get(i).setCollegeCode(collegeCodeC.getText());
            }
            
        }
        
    }
//-----------------------------------------------------------------------------------------------------
   public static String genNum() {
       
       // Get the academic year
        String academicYear = (String) comboBoxY.getSelectedItem();

        // Check if the array is empty or the first element is null
        if (Main.studentData == null || Main.studentData.size() == 0) {
            return academicYear + "-0001"; // Default first ID for the current year
        }

        // Handle the first element
        String firstIdNum = Main.studentData.get(0).getIdNum();
        if (Main.END.equals(firstIdNum)) {
            return academicYear + "-0001"; // If the first element is "END", start from 0001 for the current year
        }

        // Loop through the array to find the next unique ID for the current year
        int maxUniqueId = 0; // Track the maximum unique ID for the current year
        int trackYear = 0;
        int count = 0;
        
        for (int i = 0; i < Main.studentData.size(); i++) {
            String currentIdNum = Main.studentData.get(i).getIdNum();
            
            
            // Skip null or "END" values
            if (currentIdNum == null || Main.END.equals(currentIdNum)) {
                continue;
            }

            // Split the current ID into year and unique ID
            String[] parts = currentIdNum.split("-");
           
            if (parts.length != 2) {
                continue; // Skip invalid formats
            }

            // Parse the year and unique ID
            int year;
            int uniqueId;
            try {
                year = Integer.parseInt(parts[0]);
                uniqueId = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                continue; // Skip if the year or unique ID is not a number
            }

            // Only consider IDs for the current year
            if (year == Integer.parseInt(academicYear)){
                
                if(trackYear != year){
                    trackYear = year;
                    count = 0;
                } else {
                    count++;
                }
                
                if(count == 0 && uniqueId != 1){      
                    return academicYear + "-0001";
                }
                
                if (uniqueId > maxUniqueId && uniqueId -1 == maxUniqueId) {
                    maxUniqueId = uniqueId;
                } else {
                    int nextUniqueId = maxUniqueId + 1;
                    return academicYear + formatUniqueId(nextUniqueId);
                }
            }
        }

        // Generate the next unique ID for the current year
        int nextUniqueId = maxUniqueId + 1;
        return academicYear + formatUniqueId(nextUniqueId);
}

// Helper method to format the unique ID
    private static String formatUniqueId(int uniqueId) {
        if (uniqueId < 10) {
            return "-000" + uniqueId;
        } else if (uniqueId < 100) {
            return "-00" + uniqueId;
        } else if (uniqueId < 1000) {
            return "-0" + uniqueId;
        } else {
            return "-" + uniqueId;
        }
}
    
    
//-------------------------------------------------------------------------------------------    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDialog AddCollegeDialog;
    public static javax.swing.JDialog AddProgramDialog;
    public static javax.swing.JDialog AddStudentDialog;
    public static javax.swing.JPanel MainMenu;
    public static javax.swing.JMenu SSIS;
    public static javax.swing.JButton addButtonC;
    public static javax.swing.JButton addButtonP;
    public static javax.swing.JButton cancel;
    public static javax.swing.JButton cancelButton;
    public static javax.swing.JButton cancelButtonAddC;
    public static javax.swing.JButton cancelButtonAddP;
    public static javax.swing.JButton cancelCollege;
    public static javax.swing.JButton cancelProgram;
    public static javax.swing.JTextField codeFieldC;
    public static javax.swing.JTextField codeFieldP;
    public static javax.swing.JLabel collegeCheck;
    public static javax.swing.JTextField collegeCodeC;
    public static javax.swing.JLabel collegeCodeCheck;
    public static javax.swing.JLabel collegeCodeCheckC;
    public static javax.swing.JTextField collegeCodeN;
    public static javax.swing.JTextField collegeCodeP;
    public static javax.swing.JLabel collegeColor;
    public static javax.swing.JPanel collegeListPanel;
    public static javax.swing.JLabel collegeName;
    public static javax.swing.JLabel collegeNameCheck;
    public static javax.swing.JTable collegeTable;
    public static javax.swing.JComboBox<String> comboBoxCC;
    public static javax.swing.JComboBox<String> comboBoxCCP;
    public static javax.swing.JComboBox<String> comboBoxCCStudent;
    public static javax.swing.JComboBox<String> comboBoxP;
    public static javax.swing.JComboBox<String> comboBoxSP;
    public static javax.swing.JComboBox<String> comboBoxSearch;
    public static javax.swing.JComboBox<String> comboBoxSearchCollege;
    public static javax.swing.JComboBox<String> comboBoxSearchProgram;
    public static javax.swing.JComboBox<String> comboBoxY;
    public static javax.swing.JComboBox<String> comboBoxYL;
    public static javax.swing.JComboBox<String> comboBoxYearL;
    public static javax.swing.JButton confirmButton;
    public static javax.swing.JButton delete;
    public static javax.swing.JButton deleteCollege;
    public static javax.swing.JButton deleteProgram;
    public static javax.swing.JButton editButton;
    public static javax.swing.JButton editCollege;
    public static javax.swing.JButton editProgram;
    public static javax.swing.JRadioButton female;
    public static javax.swing.JRadioButton femaleG;
    public static javax.swing.JTextField firstNameField;
    public static javax.swing.JTextField firstNameLabel;
    public static javax.swing.JLabel firstnameCheck;
    public static javax.swing.JLabel firstnameColor;
    public static javax.swing.JLabel genderCheck;
    public static javax.swing.JTextField genderField;
    public static javax.swing.ButtonGroup genderG;
    public static javax.swing.ButtonGroup genderGroup;
    public static javax.swing.JLabel idCheck;
    public static javax.swing.JLabel idColor;
    public static javax.swing.JTextField idFieldNS;
    public static javax.swing.JLabel idLabel;
    public static javax.swing.JLabel idLabel1;
    public static javax.swing.JLabel idLabel10;
    public static javax.swing.JLabel idLabel11;
    public static javax.swing.JLabel idLabel12;
    public static javax.swing.JLabel idLabel13;
    public static javax.swing.JLabel idLabel15;
    public static javax.swing.JLabel idLabel16;
    public static javax.swing.JLabel idLabel17;
    public static javax.swing.JLabel idLabel18;
    public static javax.swing.JLabel idLabel19;
    public static javax.swing.JLabel idLabel2;
    public static javax.swing.JLabel idLabel3;
    public static javax.swing.JLabel idLabel4;
    public static javax.swing.JLabel idLabel5;
    public static javax.swing.JLabel idLabel6;
    public static javax.swing.JLabel idLabel7;
    public static javax.swing.JLabel idLabel9;
    public static javax.swing.JTextField idNumberField;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JPopupMenu jPopupMenu1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTextField lastNameField;
    public static javax.swing.JTextField lastNameLabel;
    public static javax.swing.JLabel lastnameCheck;
    public static javax.swing.JLabel lastnameColor;
    public static javax.swing.JRadioButton male;
    public static javax.swing.JRadioButton maleG;
    public static javax.swing.JMenuBar menuBar;
    public static javax.swing.JTextField nameFieldC;
    public static javax.swing.JTextField nameFieldP;
    public static javax.swing.JMenuItem newProgram;
    public static javax.swing.JMenuItem newStudent;
    public static javax.swing.JMenuItem neweCollege;
    public static javax.swing.JLabel programCheck;
    public static javax.swing.JLabel programCodeCheck;
    public static javax.swing.JTextField programCodeField;
    public static javax.swing.JTextField programCodeN;
    public static javax.swing.JTextField programCodeP;
    public static javax.swing.JLabel programColor;
    public static javax.swing.JPanel programListPanel;
    public static javax.swing.JLabel programNameCheck;
    public static javax.swing.JLabel programNameColor;
    public static javax.swing.JTable programTable;
    public static javax.swing.JButton refreshCollege;
    public static javax.swing.JButton refreshProgram;
    public static javax.swing.JButton saveButton;
    public static javax.swing.JButton saveCollege;
    public static javax.swing.JButton saveProgram;
    public static javax.swing.JTextField searchField;
    public static javax.swing.JTextField searchFieldCollege;
    public static javax.swing.JTextField searchProgram;
    public static javax.swing.JTable studentTable;
    public static javax.swing.JLabel yearLevelCheck;
    public static javax.swing.JTextField yearLevelField;
    // End of variables declaration//GEN-END:variables
}
