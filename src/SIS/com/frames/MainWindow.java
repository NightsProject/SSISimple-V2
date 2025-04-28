package SIS.com.frames;


import java.awt.event.*;

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
        Components.addButtonCollegeDialog();
    }//GEN-LAST:event_addButtonCMouseClicked

    private void addButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonPMouseClicked
        Components.addButtonProgramDialog();
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
            Components.loadProgramCom(); // Use Components method
        }
    }//GEN-LAST:event_comboBoxCCStudentItemStateChanged

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        Components.confirmButtonStudentDialog(); // Use Components method
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void newStudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newStudentMouseReleased
        Components.showStudentDialog(); // Use Components method
    }//GEN-LAST:event_newStudentMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated    
        Components.formWindowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void newProgramMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProgramMouseReleased
        AddCollegeDialog.setLocationByPlatform(true);
        Components.loadCollegeToProgramDialog(); // Use Components method
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
            String num = Components.genNum();
            idFieldNS.setText(num);
        }
    
    }//GEN-LAST:event_comboBoxYItemStateChanged

    private void comboBoxPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxPItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if ("Add New".equals((String) comboBoxP.getSelectedItem())) {
                AddProgramDialog.setVisible(false);
                Components.loadCollegeToProgramDialog(); // Use Components method
            }
        }
    }//GEN-LAST:event_comboBoxPItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Components.loadStudentData(); // Use Components method
        Components.clearStudentFields(); // Use Components method
    }//GEN-LAST:event_jButton1MouseClicked

    private void refreshProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshProgramMouseClicked
        Components.loadProgramData(); // Use Components method
        Components.clearProgramFields(); // Use Components method
    }//GEN-LAST:event_refreshProgramMouseClicked

    private void searchProgramKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchProgramKeyReleased
        Components.searchProgram(); // Use Components method
    }//GEN-LAST:event_searchProgramKeyReleased

    private void saveProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveProgramMouseClicked
        Components.saveProgramClicked();
      
    }//GEN-LAST:event_saveProgramMouseClicked

    private void editProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProgramMouseClicked
        Components.editProgram();
    }//GEN-LAST:event_editProgramMouseClicked

    private void cancelProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelProgramMouseClicked
        Components.cancelProgramClicked();
    }//GEN-LAST:event_cancelProgramMouseClicked

    private void deleteProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProgramMouseClicked
        Components.deleteProgramClicked();
    }//GEN-LAST:event_deleteProgramMouseClicked

    private void programTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programTableMouseClicked
        Components.getProgramTableRowData(); // Use Components method
    }//GEN-LAST:event_programTableMouseClicked

    private void refreshCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCollegeMouseClicked
        Components.loadCollegeData(); // Use Components method
        Components.clearCollegeFields(); // Use Components method
    }//GEN-LAST:event_refreshCollegeMouseClicked

    private void collegeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegeTableMouseClicked
        Components.getCollegeTableRowData(); // Use Components method
    }//GEN-LAST:event_collegeTableMouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        Components.searchStudent(); // Use Components method
    }//GEN-LAST:event_searchFieldKeyReleased

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Components.cancelStudentClicked();
    }//GEN-LAST:event_cancelMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       Components.deleteStudentClicked();
    }//GEN-LAST:event_deleteMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        Components.saveStudentClicked();
       
    }//GEN-LAST:event_saveButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        Components.editStudentClicked();
    }//GEN-LAST:event_editButtonMouseClicked

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        Components.getStudentTableRowData(); // Use Components method
    }//GEN-LAST:event_studentTableMouseClicked

    private void deleteCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCollegeMouseClicked
        Components.deleteCollegeClicked();
    }//GEN-LAST:event_deleteCollegeMouseClicked

    private void saveCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveCollegeMouseClicked
       Components.saveCollegeClicked();
      
    }//GEN-LAST:event_saveCollegeMouseClicked

    private void editCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCollegeMouseClicked
       Components.editCollegeClicked();
    }//GEN-LAST:event_editCollegeMouseClicked

    private void cancelCollegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelCollegeMouseClicked
        
        Components.cancelCollegeClicked();
    }//GEN-LAST:event_cancelCollegeMouseClicked

    private void searchFieldCollegeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldCollegeKeyReleased
        Components.searchCollege(); // Use Components method
    }//GEN-LAST:event_searchFieldCollegeKeyReleased

    
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
