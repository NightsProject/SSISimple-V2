package SIS.com.frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }
    private void initComponents() {

        // Initialize dialogs
        AddCollegeDialog = new javax.swing.JDialog(this, "New College", true);
        AddProgramDialog = new javax.swing.JDialog(this, "New Program", true);
        AddStudentDialog = new javax.swing.JDialog(this, "New Student", true);

        // Apply dark theme colors and fonts
        Color bgDark = new Color(30, 30, 30);
        Color bgMedium = new Color(45, 45, 45);
        Color fgLight = new Color(220, 220, 220);
        Color accentColor = new Color(255, 204, 0); // Gold accent color

        Font labelFont = new Font("Segoe UI Semibold", Font.BOLD, 14);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font tableFont = new Font("Segoe UI", Font.PLAIN, 14);

        // Add components to the *DetailPanel using GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 0); // Add spacing between components

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        // **************** Initialize AddCollegeDialog ****************
        AddCollegeDialog.setSize(280, 220);
        AddCollegeDialog.setResizable(false);
        AddCollegeDialog.setLocationRelativeTo(this);
        AddCollegeDialog.getContentPane().setBackground(bgDark);

        JPanel addCollegePanel = new JPanel();
        addCollegePanel.setBackground(bgDark);
        addCollegePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        addCollegePanel.setLayout(new BoxLayout(addCollegePanel, BoxLayout.Y_AXIS));

        // College Code Label
        jLabel1 = new JLabel("College Code");
        jLabel1.setForeground(fgLight);
        jLabel1.setFont(labelFont);
        jLabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
        addCollegePanel.add(jLabel1);
        addCollegePanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // College Code Field
        codeFieldC = new JTextField();
        codeFieldC.setFont(fieldFont);
        codeFieldC.setForeground(fgLight);
        codeFieldC.setBackground(bgMedium);
        codeFieldC.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                    BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        codeFieldC.setAlignmentX(Component.LEFT_ALIGNMENT);
        codeFieldC.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        addCollegePanel.add(codeFieldC);

        // Code Error Label
        collegeCodeCheckC = new JLabel(" ");
        collegeCodeCheckC.setForeground(Color.RED);
        collegeCodeCheckC.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        collegeCodeCheckC.setAlignmentX(Component.LEFT_ALIGNMENT);
        addCollegePanel.add(collegeCodeCheckC);
        addCollegePanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // College Name Label
        jLabel2 = new JLabel("College Name");
        jLabel2.setForeground(fgLight);
        jLabel2.setFont(labelFont);
        jLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        addCollegePanel.add(jLabel2);
        addCollegePanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // College Name Field
        nameFieldC = new JTextField();
        nameFieldC.setFont(fieldFont);
        nameFieldC.setForeground(fgLight);
        nameFieldC.setBackground(bgMedium);
        nameFieldC.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                    BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        nameFieldC.setAlignmentX(Component.LEFT_ALIGNMENT);
        nameFieldC.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        addCollegePanel.add(nameFieldC);

        // Name Error Label
        collegeNameCheck = new JLabel(" ");
        collegeNameCheck.setForeground(Color.RED);
        collegeNameCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        collegeNameCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addCollegePanel.add(collegeNameCheck);

        // Button Panel
        JPanel addCollegeButtonPanel = new JPanel();
        addCollegeButtonPanel.setLayout(new BoxLayout(addCollegeButtonPanel, BoxLayout.X_AXIS));
        addCollegeButtonPanel.setBackground(bgDark);
        addCollegeButtonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Buttons
        addButtonC = new JButton("ADD");
        addButtonC.setFocusPainted(false);
        addButtonC.setBackground(accentColor);
        addButtonC.setForeground(Color.BLACK);
        addButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonCMouseClicked(evt);
            }
        });

        cancelButtonAddC = new JButton("CANCEL");
        cancelButtonAddC.setFocusPainted(false);
        cancelButtonAddC.setBackground(bgMedium);
        cancelButtonAddC.setForeground(fgLight);
        cancelButtonAddC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonAddCMouseClicked(evt);
            }
        });

        // Add buttons with spacing
        addCollegeButtonPanel.add(Box.createHorizontalGlue());
        addCollegeButtonPanel.add(addButtonC);
        addCollegeButtonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        addCollegeButtonPanel.add(cancelButtonAddC);

        // Final spacing and add to panel
        addCollegePanel.add(Box.createRigidArea(new Dimension(0, 15)));
        addCollegePanel.add(addCollegeButtonPanel);

        // Add to dialog
        AddCollegeDialog.getContentPane().add(addCollegePanel);

        // **************** Initialize AddProgramDialog ****************
        AddProgramDialog.setSize(400, 300);
        AddProgramDialog.setResizable(false);
        AddProgramDialog.setLocationRelativeTo(this);
        AddProgramDialog.getContentPane().setBackground(bgDark);

        JPanel addProgramPanel = new JPanel();
        addProgramPanel.setBackground(bgDark);
        addProgramPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        addProgramPanel.setLayout(new BoxLayout(addProgramPanel, BoxLayout.Y_AXIS));

        // Program Code Label
        jLabel3 = new JLabel("Program Code");
        jLabel3.setForeground(fgLight);
        jLabel3.setFont(labelFont);
        jLabel3.setAlignmentX(Component.LEFT_ALIGNMENT);
        addProgramPanel.add(jLabel3);
        addProgramPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // Program Code Field
        codeFieldP = new JTextField();
        codeFieldP.setFont(fieldFont);
        codeFieldP.setForeground(fgLight);
        codeFieldP.setBackground(bgMedium);
        codeFieldP.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), 
                                    BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        codeFieldP.setAlignmentX(Component.LEFT_ALIGNMENT);
        codeFieldP.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        addProgramPanel.add(codeFieldP);

        // Program Code Error
        programCodeCheck = new JLabel(" ");
        programCodeCheck.setForeground(Color.RED);
        programCodeCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        programCodeCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addProgramPanel.add(programCodeCheck);
        addProgramPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Program Name Label
        jLabel4 = new JLabel("Program Name");
        jLabel4.setForeground(fgLight);
        jLabel4.setFont(labelFont);
        jLabel4.setAlignmentX(Component.LEFT_ALIGNMENT);
        addProgramPanel.add(jLabel4);
        addProgramPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // Program Name Field
        nameFieldP = new JTextField();
        nameFieldP.setFont(fieldFont);
        nameFieldP.setForeground(fgLight);
        nameFieldP.setBackground(bgMedium);
        nameFieldP.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), 
                                    BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        nameFieldP.setAlignmentX(Component.LEFT_ALIGNMENT);
        nameFieldP.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        addProgramPanel.add(nameFieldP);

        // Program Name Error
        programNameCheck = new JLabel(" ");
        programNameCheck.setForeground(Color.RED);
        programNameCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        programNameCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addProgramPanel.add(programNameCheck);
        addProgramPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // College Code Label
        jLabel5 = new JLabel("College Code");
        jLabel5.setForeground(fgLight);
        jLabel5.setFont(labelFont);
        jLabel5.setAlignmentX(Component.LEFT_ALIGNMENT);
        addProgramPanel.add(jLabel5);
        addProgramPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // ComboBox for College Code
        comboBoxCC = new JComboBox<>();
        comboBoxCC.setFont(fieldFont);
        comboBoxCC.setForeground(fgLight);
        comboBoxCC.setBackground(bgMedium);
        comboBoxCC.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), 
                                        BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        comboBoxCC.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBoxCC.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        addProgramPanel.add(comboBoxCC);

        // College Code Error
        collegeCodeCheck = new JLabel(" ");
        collegeCodeCheck.setForeground(Color.RED);
        collegeCodeCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        collegeCodeCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addProgramPanel.add(collegeCodeCheck);

        // Buttons Panel
        JPanel addProgramButtonPanel = new JPanel();
        addProgramButtonPanel.setLayout(new BoxLayout(addProgramButtonPanel, BoxLayout.X_AXIS));
        addProgramButtonPanel.setBackground(bgDark);
        addProgramButtonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // ADD Button
        addButtonP = new JButton("ADD");
        addButtonP.setFocusPainted(false);
        addButtonP.setBackground(accentColor);
        addButtonP.setForeground(Color.BLACK);
        addButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonPMouseClicked(evt);
            }
        });

        // CANCEL Button
        cancelButtonAddP = new JButton("CANCEL");
        cancelButtonAddP.setFocusPainted(false);
        cancelButtonAddP.setBackground(bgMedium);
        cancelButtonAddP.setForeground(fgLight);
        cancelButtonAddP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonAddPMouseClicked(evt);
            }
        });

        // Add buttons to panel with right alignment
        addProgramButtonPanel.add(Box.createHorizontalGlue());
        addProgramButtonPanel.add(addButtonP);
        addProgramButtonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        addProgramButtonPanel.add(cancelButtonAddP);

        // Final spacing
        addProgramPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        addProgramPanel.add(addProgramButtonPanel);

        // Add to dialog
        AddProgramDialog.getContentPane().add(addProgramPanel);

        // **************** Initialize AddStudentDialog ****************
        AddStudentDialog.setSize(360, 650);
        AddStudentDialog.setResizable(false);
        AddStudentDialog.setLocationRelativeTo(this);
        AddStudentDialog.getContentPane().setBackground(bgDark);
        AddStudentDialog.getContentPane().setLayout(new BorderLayout());

        // Wrapper panel to enforce full-width BoxLayout
        JPanel wrapper = new JPanel();
        wrapper.setBackground(bgDark);
        wrapper.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        wrapper.setLayout(new BoxLayout(wrapper, BoxLayout.Y_AXIS));

        // **************** Inner panel contents ****************
        JPanel addStudentPanel = new JPanel();
        addStudentPanel.setBackground(bgDark);
        addStudentPanel.setLayout(new BoxLayout(addStudentPanel, BoxLayout.Y_AXIS));

        // Academic Year label
        jLabel7 = new JLabel("ACADEMIC YEAR");
        jLabel7.setForeground(fgLight);
        jLabel7.setFont(labelFont);
        jLabel7.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(jLabel7);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // Academic Year combo
        comboBoxY = new JComboBox<>(new String[] { "2024", "2025", "2026" });
        comboBoxY.setFont(fieldFont);
        comboBoxY.setForeground(fgLight);
        comboBoxY.setBackground(bgMedium);
        comboBoxY.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                            BorderFactory.createEmptyBorder(3,5,3,5)));
        comboBoxY.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBoxY.setEditable(true);
        comboBoxY.setMaximumSize(new Dimension(Integer.MAX_VALUE, comboBoxY.getPreferredSize().height));
        comboBoxY.addItemListener(evt -> comboBoxYItemStateChanged(evt));
        addStudentPanel.add(comboBoxY);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // ID Number label
        idLabel = new JLabel("ID NUMBER");
        idLabel.setForeground(fgLight);
        idLabel.setFont(labelFont);
        idLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idLabel);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        // ID Number field
        idFieldNS = new JTextField();
        idFieldNS.setFont(fieldFont);
        idFieldNS.setForeground(fgLight);
        idFieldNS.setBackground(bgMedium);
        idFieldNS.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        idFieldNS.setAlignmentX(Component.LEFT_ALIGNMENT);
        idFieldNS.setMaximumSize(new Dimension(Integer.MAX_VALUE, idFieldNS.getPreferredSize().height));
        addStudentPanel.add(idFieldNS);

        // ID error
        idCheck = new JLabel(" ");
        idCheck.setForeground(Color.RED);
        idCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        idCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // First Name
        idLabel2 = new JLabel("FIRST NAME");
        idLabel2.setForeground(fgLight);
        idLabel2.setFont(labelFont);
        idLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idLabel2);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        firstNameField = new JTextField();
        firstNameField.setFont(fieldFont);
        firstNameField.setForeground(fgLight);
        firstNameField.setBackground(bgMedium);
        firstNameField.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                                    BorderFactory.createEmptyBorder(5,5,5,5)));
        firstNameField.setAlignmentX(Component.LEFT_ALIGNMENT);
        firstNameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, firstNameField.getPreferredSize().height));
        addStudentPanel.add(firstNameField);

        // First Name error
        firstnameCheck = new JLabel(" ");
        firstnameCheck.setForeground(Color.RED);
        firstnameCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        firstnameCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(firstnameCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Last Name
        idLabel3 = new JLabel("LAST NAME");
        idLabel3.setForeground(fgLight);
        idLabel3.setFont(labelFont);
        idLabel3.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idLabel3);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        lastNameField = new JTextField();
        lastNameField.setFont(fieldFont);
        lastNameField.setForeground(fgLight);
        lastNameField.setBackground(bgMedium);
        lastNameField.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                                BorderFactory.createEmptyBorder(5,5,5,5)));
        lastNameField.setAlignmentX(Component.LEFT_ALIGNMENT);
        lastNameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, lastNameField.getPreferredSize().height));
        addStudentPanel.add(lastNameField);

        // Last Name error
        lastnameCheck = new JLabel(" ");
        lastnameCheck.setForeground(Color.RED);
        lastnameCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        lastnameCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(lastnameCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Year Level
        idLabel4 = new JLabel("YEAR LEVEL");
        idLabel4.setForeground(fgLight);
        idLabel4.setFont(labelFont);
        idLabel4.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idLabel4);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        comboBoxYL = new JComboBox<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" });
        comboBoxYL.setFont(fieldFont);
        comboBoxYL.setForeground(fgLight);
        comboBoxYL.setBackground(bgMedium);
        comboBoxYL.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                            BorderFactory.createEmptyBorder(3,5,3,5)));
        comboBoxYL.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBoxYL.setMaximumSize(new Dimension(Integer.MAX_VALUE, comboBoxYL.getPreferredSize().height));
        addStudentPanel.add(comboBoxYL);

        // Year Level error
        yearLevelCheck = new JLabel(" ");
        yearLevelCheck.setForeground(Color.RED);
        yearLevelCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        yearLevelCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(yearLevelCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Gender
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 0));
        genderPanel.setBackground(bgDark);

        idLabel5 = new JLabel("GENDER");
        idLabel5.setForeground(fgLight);
        idLabel5.setFont(labelFont);
        genderPanel.add(idLabel5);

        male = new JRadioButton("Male");
        male.setForeground(fgLight);
        male.setBackground(bgDark);
        male.setFont(fieldFont);
        male.setSelected(true);
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderPanel.add(male);

        female = new JRadioButton("Female");
        female.setForeground(fgLight);
        female.setBackground(bgDark);
        female.setFont(fieldFont);
        genderGroup.add(female);
        genderPanel.add(female);

        genderPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(genderPanel);

        // Gender error
        genderCheck = new JLabel(" ");
        genderCheck.setForeground(Color.RED);
        genderCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        genderCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(genderCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // College Code
        idLabel1 = new JLabel("COLLEGE CODE");
        idLabel1.setForeground(fgLight);
        idLabel1.setFont(labelFont);
        idLabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idLabel1);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        comboBoxCCStudent = new JComboBox<>(new String[] { "" , "Add New"});
        comboBoxCCStudent.setFont(fieldFont);
        comboBoxCCStudent.setForeground(fgLight);
        comboBoxCCStudent.setBackground(bgMedium);
        comboBoxCCStudent.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                                    BorderFactory.createEmptyBorder(3,5,3,5)));
        comboBoxCCStudent.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBoxCCStudent.setMaximumSize(new Dimension(Integer.MAX_VALUE, comboBoxCCStudent.getPreferredSize().height));
        comboBoxCCStudent.addItemListener(evt -> comboBoxCCStudentItemStateChanged(evt));
        addStudentPanel.add(comboBoxCCStudent);

        // College error
        collegeCheck = new JLabel(" ");
        collegeCheck.setForeground(Color.RED);
        collegeCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        collegeCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(collegeCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Program Code
        idLabel6 = new JLabel("PROGRAM CODE");
        idLabel6.setForeground(fgLight);
        idLabel6.setFont(labelFont);
        idLabel6.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(idLabel6);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        comboBoxP = new JComboBox<>(new String[] { "", "Add New"});
        comboBoxP.setFont(fieldFont);
        comboBoxP.setForeground(fgLight);
        comboBoxP.setBackground(bgMedium);
        comboBoxP.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1),
                                                            BorderFactory.createEmptyBorder(3,5,3,5)));
        comboBoxP.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBoxP.setMaximumSize(new Dimension(Integer.MAX_VALUE, comboBoxP.getPreferredSize().height));
        comboBoxP.addItemListener(evt -> comboBoxPItemStateChanged(evt));
        addStudentPanel.add(comboBoxP);

        // Program error
        programCheck = new JLabel(" ");
        programCheck.setForeground(Color.RED);
        programCheck.setFont(new Font("Segoe UI", Font.ITALIC, 11));
        programCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        addStudentPanel.add(programCheck);
        addStudentPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Buttons
        JPanel studentButtonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        studentButtonsPanel.setBackground(bgDark);
        studentButtonsPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        confirmButton = new JButton("CONFIRM");
        confirmButton.setFocusPainted(false);
        confirmButton.setBackground(accentColor);
        confirmButton.setForeground(Color.BLACK);
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        studentButtonsPanel.add(confirmButton);

        cancelButton = new JButton("CANCEL");
        cancelButton.setFocusPainted(false);
        cancelButton.setBackground(bgMedium);
        cancelButton.setForeground(fgLight);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        studentButtonsPanel.add(cancelButton);

        addStudentPanel.add(studentButtonsPanel);

        // Add inner panel to wrapper, then to dialog
        wrapper.add(addStudentPanel);
        AddStudentDialog.getContentPane().add(wrapper, BorderLayout.CENTER);


        

        // **************** Initialize Main Window ****************

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSISimple-V2");
        setMinimumSize(new Dimension(1300, 700));
        setBackground(bgDark);
        setLocationRelativeTo(null);
        setResizable(false);

        // Use BorderLayout for main window content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(bgDark);

        // Create a panel for the title
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(bgDark); // match the background if you want consistency
        titlePanel.setPreferredSize(new Dimension(1300, 50)); // adjust height as needed
        
        // Create a label for the title
        JLabel titleLabel = new JLabel("SSISimple                                                                                                                                         ");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // customize font and size
        titleLabel.setForeground(accentColor); // set text color, e.g., white
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // padding: top, left, bottom, right
        
        ImageIcon title = new ImageIcon(getClass().getResource("/SIS/com/icons/register.png"));
        Image img = title.getImage().getScaledInstance (40, 40, Image.SCALE_SMOOTH);
        titleLabel.setIcon(new ImageIcon(img));

        // Add the label to the panel
        titlePanel.add(titleLabel);

        // Add the panel to the top (NORTH) of the content pane
        contentPane.add(titlePanel, BorderLayout.NORTH);
        
        // ---------------- Tabs for Students, Programs, colleges ----------------

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.setFont(labelFont);
        tabbedPane.setBackground(bgMedium);
        tabbedPane.setForeground(fgLight);
        tabbedPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // =========== Students Tab ===========
        JPanel studentsMainPanel = new JPanel();
        studentsMainPanel.setBackground(bgDark);
        studentsMainPanel.setLayout(new BorderLayout(15, 15));
        studentsMainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Upper panel for search and refresh
        JPanel studentTopPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        studentTopPanel.setBackground(bgDark);

        JLabel searchLabel = new JLabel("SEARCH");
        searchLabel.setForeground(accentColor);
        searchLabel.setFont(labelFont);
        studentTopPanel.add(searchLabel);

        searchField = new JTextField(20);
        searchField.setFont(fieldFont);
        searchField.setForeground(fgLight);
        searchField.setBackground(bgMedium);
        searchField.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        searchField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        studentTopPanel.add(searchField);

        comboBoxSearch = new JComboBox<>(new String[] { "ID Number", "Firstname", "Lastname", "Year Level", "Gender", "Program Code" });
        comboBoxSearch.setFont(fieldFont);
        comboBoxSearch.setForeground(fgLight);
        comboBoxSearch.setBackground(bgMedium);
        comboBoxSearch.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        studentTopPanel.add(comboBoxSearch);

        JButton refreshStudentListBtn = new JButton("REFRESH LIST");
        refreshStudentListBtn.setBackground(accentColor);
        refreshStudentListBtn.setForeground(Color.BLACK);
        refreshStudentListBtn.setFocusPainted(false);
        refreshStudentListBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        studentTopPanel.add(refreshStudentListBtn);

        // Add New Student Button
        JButton addNewStudentBtn = new JButton("ADD NEW STUDENT");
        addNewStudentBtn.setBackground(accentColor);
        addNewStudentBtn.setForeground(Color.BLACK);
        addNewStudentBtn.setFocusPainted(false);
        addNewStudentBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                newStudentMouseReleased(evt); // Opens the Add Student dialog
            }
        });
        studentTopPanel.add(addNewStudentBtn);

        studentsMainPanel.add(studentTopPanel, BorderLayout.NORTH);

        // Student JTable inside scroll pane
        studentTable = new JTable();
        studentTable.setAutoCreateRowSorter(true);
        studentTable.setFont(tableFont);
        studentTable.setForeground(fgLight);
        studentTable.setBackground(bgMedium);
        studentTable.setSelectionBackground(accentColor);
        studentTable.setSelectionForeground(Color.BLACK);
        studentTable.setRowHeight(24);
        studentTable.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID Number", "First Name", "Last Name", "Gender", "Year Level", "Program Code"}) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        studentTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        JScrollPane studentScrollPane = new JScrollPane(studentTable);
        studentsMainPanel.add(studentScrollPane, BorderLayout.CENTER);

        // Student detail and action panel (right side)
        JPanel studentDetailPanel = new JPanel();
        studentDetailPanel.setBackground(bgMedium);
        studentDetailPanel.setLayout(new GridBagLayout());
        studentDetailPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        studentDetailPanel.setPreferredSize(new Dimension(320,300));
    
      
        // ID Number Field with label on the left
        JPanel idNumberPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); 
        idNumberPanel.setBackground(bgMedium);
        idLabel7 = new JLabel("ID NUMBER");
        idLabel7.setForeground(accentColor);
        idLabel7.setFont(labelFont);
        idNumberPanel.add(idLabel7);
        idNumberField = new JTextField();
        idNumberField.setFont(fieldFont);
        idNumberField.setForeground(fgLight);
        idNumberField.setBackground(bgDark);
        idNumberField.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        idNumberField.setFocusable(false);
        idNumberField.setHorizontalAlignment(JTextField.CENTER);
        idNumberField.setPreferredSize(new Dimension(185, 30)); 
        idNumberField.setMaximumSize(new Dimension(185, 30));   
        idNumberPanel.add(idNumberField);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        studentDetailPanel.add(idNumberPanel, gbc);

        // First Name Field with label on the left
        JPanel firstNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); 
        firstNamePanel.setBackground(bgMedium);
        idLabel9 = new JLabel("FIRST NAME");
        idLabel9.setForeground(accentColor);
        idLabel9.setFont(labelFont);
        firstNamePanel.add(idLabel9);
        firstNameLabel = new JTextField();
        firstNameLabel.setFont(fieldFont);
        firstNameLabel.setForeground(fgLight);
        firstNameLabel.setBackground(bgDark);
        firstNameLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        firstNameLabel.setFocusable(false);
        firstNameLabel.setHorizontalAlignment(JTextField.CENTER);
        firstNameLabel.setPreferredSize(new Dimension(176, 30)); 
        firstNameLabel.setMaximumSize(new Dimension(176, 30));   
        firstNamePanel.add(firstNameLabel);
        gbc.gridy++;
        studentDetailPanel.add(firstNamePanel, gbc);
        
        // Last Name Field with label on the left
        JPanel lastNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 11, 0)); // Horizontal gap: 10, Vertical gap: 0
        lastNamePanel.setBackground(bgMedium);
        idLabel10 = new JLabel("LAST NAME");
        idLabel10.setForeground(accentColor);
        idLabel10.setFont(labelFont);
        lastNamePanel.add(idLabel10);
        lastNameLabel = new JTextField();
        lastNameLabel.setFont(fieldFont);
        lastNameLabel.setForeground(fgLight);
        lastNameLabel.setBackground(bgDark);
        lastNameLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        lastNameLabel.setFocusable(false);
        lastNameLabel.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        lastNameLabel.setPreferredSize(new Dimension(176, 30)); // Width: 176, Height: 30
        lastNameLabel.setMaximumSize(new Dimension(176, 30));   // Ensure it doesn't exceed this size
        lastNamePanel.add(lastNameLabel);
        gbc.gridy++;
        studentDetailPanel.add(lastNamePanel, gbc);

        // Year Level Field with label on the left
        JPanel yearLevelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); // Horizontal gap: 10, Vertical gap: 0
        yearLevelPanel.setBackground(bgMedium);
        idLabel11 = new JLabel("YEAR LEVEL");
        idLabel11.setForeground(accentColor);
        idLabel11.setFont(labelFont);
        yearLevelPanel.add(idLabel11);
        yearLevelField = new JTextField();
        yearLevelField.setFont(fieldFont);
        yearLevelField.setForeground(fgLight);
        yearLevelField.setBackground(bgDark);
        yearLevelField.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        yearLevelField.setFocusable(false);
        yearLevelField.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        yearLevelField.setPreferredSize(new Dimension(176, 30)); // Width: 176, Height: 30
        yearLevelField.setMaximumSize(new Dimension(176, 30));   // Ensure it doesn't exceed this size
        yearLevelPanel.add(yearLevelField);

        gbc.gridy++;
        studentDetailPanel.add(yearLevelPanel, gbc);

        // Year Level Field (edit Panel via comboBoxYearL)
        comboBoxYearL = new JComboBox<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" });
        comboBoxYearL.setFont(fieldFont);
        comboBoxYearL.setForeground(fgLight);
        comboBoxYearL.setBackground(bgDark);
        comboBoxYearL.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, accentColor));
        comboBoxYearL.setPreferredSize(new Dimension(176, 30)); // Width: 176, Height: 30
        comboBoxYearL.setMaximumSize(new Dimension(176, 30));   // Ensure it doesn't exceed this size
      
        comboBoxYearL.setVisible(false);
        yearLevelPanel.add(comboBoxYearL);

    
        // Gender Field with label on the left
        JPanel genderPanelS = new JPanel(new FlowLayout(FlowLayout.LEFT, 25, 0)); // Horizontal gap: 10, Vertical gap: 0
        genderPanelS.setBackground(bgMedium);
        idLabel12 = new JLabel("GENDER");
        idLabel12.setForeground(accentColor);
        idLabel12.setFont(labelFont);
        genderPanelS.add(idLabel12);
        genderField = new JTextField();
        genderField.setFont(fieldFont);
        genderField.setForeground(fgLight);
        genderField.setBackground(bgDark);
        genderField.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        genderField.setFocusable(false);
        genderField.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        genderField.setPreferredSize(new Dimension(176, 30)); // Width: 176, Height: 30
        genderField.setMaximumSize(new Dimension(176, 30));   // Ensure it doesn't exceed this size
        genderPanelS.add(genderField);
        gbc.gridy++;
        studentDetailPanel.add(genderPanelS, gbc);


        genderG = new ButtonGroup();
        maleG = new JRadioButton("Male");
        maleG.setForeground(fgLight);
      
        genderG.add(maleG);
        genderPanelS.add(maleG);
        femaleG = new JRadioButton("Female");
        femaleG.setForeground(fgLight);
        genderG.add(femaleG);
        genderPanelS.add(femaleG);
      
        // Program Code Field with label on the left
        JPanel programCodePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); // Horizontal gap: 10, Vertical gap: 0
        programCodePanel.setBackground(bgMedium);

        idLabel13 = new JLabel("PROGRAM CODE");
        idLabel13.setForeground(accentColor);
        idLabel13.setFont(labelFont);
        programCodePanel.add(idLabel13);
        programCodeField = new JTextField();
        programCodeField.setFont(fieldFont);
        programCodeField.setForeground(fgLight);
        programCodeField.setBackground(bgDark);
        programCodeField.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        programCodeField.setFocusable(false);
        programCodeField.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        programCodeField.setPreferredSize(new Dimension(140, 30)); // Width: 176, Height: 30
        programCodeField.setMaximumSize(new Dimension(140, 30));   // Ensure it doesn't exceed this size
        programCodePanel.add(programCodeField);
        gbc.gridy++;
        studentDetailPanel.add(programCodePanel, gbc);

        // Program comboBoxSP for editing association, disabled by default
        comboBoxSP = new JComboBox<>(new String[] {});
        comboBoxSP.setFont(fieldFont);
        comboBoxSP.setForeground(fgLight);
        comboBoxSP.setBackground(bgDark);
        comboBoxSP.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, accentColor));
        comboBoxSP.setPreferredSize(new Dimension(140, 30)); // Width: 176, Height: 30
        comboBoxSP.setMaximumSize(new Dimension(140, 30));   // Ensure it doesn't exceed this size
        comboBoxSP.setVisible(false);
        programCodePanel.add(comboBoxSP);

        // Action Buttons Panel (edit, save, delete, cancel)
        JPanel studentActionButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        studentActionButtons.setBackground(bgMedium);

        editButton = new JButton("EDIT");
        editButton.setBackground(accentColor);
        editButton.setForeground(Color.BLACK);
        editButton.setFocusPainted(false);
        editButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });
        studentActionButtons.add(editButton);

        saveButton = new JButton("SAVE");
        saveButton.setBackground(accentColor);
        saveButton.setForeground(Color.BLACK);
        saveButton.setFocusPainted(false);
        saveButton.setVisible(false);
        saveButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        studentActionButtons.add(saveButton);

        delete = new JButton("DELETE");
        delete.setBackground(accentColor);
        delete.setForeground(Color.BLACK);
        delete.setFocusPainted(false);
        delete.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        studentActionButtons.add(delete);

        cancel = new JButton("CANCEL");
        cancel.setBackground(accentColor);
        cancel.setForeground(Color.BLACK);
        cancel.setFocusPainted(false);
        cancel.setVisible(false);
        cancel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        studentActionButtons.add(cancel);

        gbc.gridy++;
        studentDetailPanel.add(studentActionButtons, gbc);

        
        // Create a container panel for the EAST region
        JPanel eastContainer = new JPanel();
        eastContainer.setLayout(new BoxLayout(eastContainer, BoxLayout.Y_AXIS)); // Stack components vertically
        eastContainer.setBackground(bgDark);

        // Add the studentDetailPanel to the container
        eastContainer.add(studentDetailPanel);

        // Add a spacer below the studentDetailPanel
        JPanel eastSpacer = new JPanel();
        eastSpacer.setBackground(bgDark); // Match the background color
        eastSpacer.setPreferredSize(new Dimension(320, 220)); // Set the height of the spacer
        eastContainer.add(eastSpacer);

        // Add the container to the EAST region of the studentsMainPanel
        studentsMainPanel.add(eastContainer, BorderLayout.EAST);
        // Load the icon
        ImageIcon studentIcon = new ImageIcon(getClass().getResource("/SIS/com/icons/student.png"));

        // Optional: Scale the icon to fit nicely in the tab
        Image scaledImage = studentIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Add the tab with text, icon, and component
        tabbedPane.addTab("Students      ", scaledIcon, studentsMainPanel);


        // =========== Programs Tab ===========
        programListPanel = new JPanel();
        programListPanel.setBackground(bgDark);
        programListPanel.setLayout(new BorderLayout(10, 10));
        programListPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel programTopPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        programTopPanel.setBackground(bgDark);

        JLabel programSearchLabel = new JLabel("SEARCH");
        programSearchLabel.setForeground(accentColor);
        programSearchLabel.setFont(labelFont);
        programTopPanel.add(programSearchLabel);

        searchProgram = new JTextField(20);
        searchProgram.setFont(fieldFont);
        searchProgram.setForeground(fgLight);
        searchProgram.setBackground(bgMedium);
        searchProgram.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        searchProgram.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchProgramKeyReleased(evt);
            }
        });
        programTopPanel.add(searchProgram);

        comboBoxSearchProgram = new JComboBox<>(new String[] { "Program Code", "Program Name", "College Code" });
        comboBoxSearchProgram.setFont(fieldFont);
        comboBoxSearchProgram.setForeground(fgLight);
        comboBoxSearchProgram.setBackground(bgMedium);
        comboBoxSearchProgram.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        programTopPanel.add(comboBoxSearchProgram);

        JButton refreshProgramBtn = new JButton("REFRESH LIST");
        refreshProgramBtn.setBackground(accentColor);
        refreshProgramBtn.setForeground(Color.BLACK);
        refreshProgramBtn.setFocusPainted(false);
        refreshProgramBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                refreshProgramMouseClicked(evt);
            }
        });
        programTopPanel.add(refreshProgramBtn);

        // Add New Program Button
        JButton addNewProgramBtn = new JButton("ADD NEW PROGRAM");
        addNewProgramBtn.setBackground(accentColor);
        addNewProgramBtn.setForeground(Color.BLACK);
        addNewProgramBtn.setFocusPainted(false);
        addNewProgramBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                newProgramMouseReleased(evt); // Opens the Add Program dialog
            }
        });
        programTopPanel.add(addNewProgramBtn);

        programListPanel.add(programTopPanel, BorderLayout.NORTH);

        programTable = new JTable();
        DefaultTableModel programTableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Program Code", "Program Name" }) {
            boolean[] canEdit = new boolean[] { false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        programTable.setModel(programTableModel);
        programTable.setFont(tableFont);
        programTable.setForeground(fgLight);
        programTable.setBackground(bgMedium);
        programTable.setSelectionBackground(accentColor);
        programTable.setSelectionForeground(Color.BLACK);
        programTable.setRowHeight(24);
        programTable.setAutoCreateRowSorter(true);
        programTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                programTableMouseClicked(evt);
            }
        });
        JScrollPane programScrollPane = new JScrollPane(programTable);
        programListPanel.add(programScrollPane, BorderLayout.CENTER);

        // Program details & action panel right side
        JPanel programDetailsPanel = new JPanel();
        programDetailsPanel.setPreferredSize(new Dimension(320, 0));
        programDetailsPanel.setBackground(bgMedium);
        programDetailsPanel.setLayout(new GridBagLayout());
        programDetailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JPanel programCodePJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); 
        programCodePJPanel.setBackground(bgMedium);
        idLabel16 = new JLabel("PROGRAM CODE");
        idLabel16.setForeground(accentColor);
        idLabel16.setFont(labelFont);
        programCodePJPanel.add(idLabel16);

        programCodeP = new JTextField();
        programCodeP.setFont(fieldFont);
        programCodeP.setForeground(fgLight);
        programCodeP.setBackground(bgDark);
        programCodeP.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        programCodeP.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        programCodeP.setPreferredSize(new Dimension(150, 30)); // Width: 176, Height: 30
        programCodeP.setMaximumSize(new Dimension(150, 30));   // Ensure it doesn't exceed this size
        programCodePJPanel.add(programCodeP);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        programDetailsPanel.add(programCodePJPanel, gbc);


        JPanel programNamePJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); 
        programNamePJPanel.setBackground(bgMedium);
        idLabel19 = new JLabel("NAME");
        idLabel19.setForeground(accentColor);
        idLabel19.setFont(labelFont);
        programNamePJPanel.add(idLabel19);

        programCodeN = new JTextField();
        programCodeN.setFont(fieldFont);
        programCodeN.setForeground(fgLight);
        programCodeN.setBackground(bgDark);
        programCodeN.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        programCodeN.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        programCodeN.setPreferredSize(new Dimension(225, 30)); // Width: 176, Height: 30
        programCodeN.setMaximumSize(new Dimension(225, 30));   // Ensure it doesn't exceed this size
     
        programNamePJPanel.add(programCodeN);
       
        gbc.gridy++;
        programDetailsPanel.add(programNamePJPanel, gbc);

        JPanel collegeCodePJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 14, 0)); 
        collegeCodePJPanel.setBackground(bgMedium);
        idLabel15 = new JLabel("COLLEGE CODE");
        idLabel15.setForeground(accentColor);
        idLabel15.setFont(labelFont);
        collegeCodePJPanel.add(idLabel15);

        collegeCodeP = new JTextField();
        collegeCodeP.setFont(fieldFont);
        collegeCodeP.setForeground(fgLight);
        collegeCodeP.setBackground(bgDark);
        collegeCodeP.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        collegeCodeP.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        collegeCodeP.setPreferredSize(new Dimension(150, 30)); // Width: 176, Height: 30
        collegeCodeP.setMaximumSize(new Dimension(150, 30));   // Ensure it doesn't exceed this size
     
        collegeCodePJPanel.add(collegeCodeP);
       
        //this should replace the text field for college code when clicked edit
        gbc.gridy++;
        programDetailsPanel.add(collegeCodePJPanel, gbc);

        //college combo box
        comboBoxCCP = new JComboBox<>(new String[] {});
        comboBoxCCP.setFont(fieldFont);
        comboBoxCCP.setForeground(fgLight);
        comboBoxCCP.setBackground(bgDark);
        comboBoxCCP.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, accentColor));
        comboBoxCCP.setVisible(false);
        comboBoxCCP.setPreferredSize(new Dimension(150, 30)); // Width: 176, Height: 30
        comboBoxCCP.setMaximumSize(new Dimension(150, 30));   // Ensure it doesn't exceed this size
     
        collegeCodePJPanel.add(comboBoxCCP);
     

        JPanel programActionButtonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        programActionButtonsPanel.setBackground(bgMedium);

        editProgram = new JButton("EDIT");
        editProgram.setBackground(accentColor);
        editProgram.setForeground(Color.BLACK);
        editProgram.setFocusPainted(false);
        editProgram.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                editProgramMouseClicked(evt);
            }
        });
        programActionButtonsPanel.add(editProgram);

        saveProgram = new JButton("SAVE");
        saveProgram.setBackground(accentColor);
        saveProgram.setForeground(Color.BLACK);
        saveProgram.setFocusPainted(false);
        saveProgram.setVisible(false);
        saveProgram.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                saveProgramMouseClicked(evt);
            }
        });
        programActionButtonsPanel.add(saveProgram);

        deleteProgram = new JButton("DELETE");
        deleteProgram.setBackground(accentColor);
        deleteProgram.setForeground(Color.BLACK);
        deleteProgram.setFocusPainted(false);
        deleteProgram.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                deleteProgramMouseClicked(evt);
            }
        });
        programActionButtonsPanel.add(deleteProgram);

        cancelProgram = new JButton("CANCEL");
        cancelProgram.setBackground(accentColor);
        cancelProgram.setForeground(Color.BLACK);
        cancelProgram.setFocusPainted(false);
        cancelProgram.setVisible(false);
        cancelProgram.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cancelProgramMouseClicked(evt);
            }
        });
        programActionButtonsPanel.add(cancelProgram);
        
        gbc.gridy++;
        programDetailsPanel.add(programActionButtonsPanel, gbc);

        // Modify the programDetailsPanel
        JPanel programContainer = new JPanel();
        programContainer.setLayout(new BoxLayout(programContainer, BoxLayout.Y_AXIS)); // Stack components vertically
        programContainer.setBackground(bgDark);

        // Add the programDetailsPanel to the container
        programContainer.add(programDetailsPanel);

        // Add a spacer below the programDetailsPanel
        JPanel programSpacer = new JPanel();
        programSpacer.setBackground(bgDark); // Match the background color
        programSpacer.setPreferredSize(new Dimension(350, 350)); // Set the height of the spacer
        programContainer.add(programSpacer);

        // Add the container to the EAST region of the programListPanel
        programListPanel.add(programContainer, BorderLayout.EAST);

       

        contentPane.add(tabbedPane, BorderLayout.CENTER);

        ImageIcon programIcon = new ImageIcon(getClass().getResource("/SIS/com/icons/book.png"));

          // Optional: Scale the icon to fit nicely in the tab
        Image programImage = programIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon scaledProgramIcon = new ImageIcon(programImage);
  
          // Add the tab with text, icon, and component
        tabbedPane.addTab("Programs      ", scaledProgramIcon, programListPanel);
        
        // =========== Colleges Tab ===========
        collegeListPanel = new JPanel();
        collegeListPanel.setBackground(bgDark);
        collegeListPanel.setLayout(new BorderLayout(10, 10));
        collegeListPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel collegeTopPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        collegeTopPanel.setBackground(bgDark);

        JLabel collegeSearchLabel = new JLabel("SEARCH");
        collegeSearchLabel.setForeground(accentColor);
        collegeSearchLabel.setFont(labelFont);
        collegeTopPanel.add(collegeSearchLabel);

        searchFieldCollege = new JTextField(20);
        searchFieldCollege.setFont(fieldFont);
        searchFieldCollege.setForeground(fgLight);
        searchFieldCollege.setBackground(bgMedium);
        searchFieldCollege.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        searchFieldCollege.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchFieldCollegeKeyReleased(evt);
            }
        });
        collegeTopPanel.add(searchFieldCollege);

        comboBoxSearchCollege = new JComboBox<>(new String[] { "College Code", "College Name" });
        comboBoxSearchCollege.setFont(fieldFont);
        comboBoxSearchCollege.setForeground(fgLight);
        comboBoxSearchCollege.setBackground(bgMedium);
        comboBoxSearchCollege.setBorder(BorderFactory.createCompoundBorder(new LineBorder(accentColor, 1), BorderFactory.createEmptyBorder(3, 5, 3, 5)));
        collegeTopPanel.add(comboBoxSearchCollege);

        JButton refreshCollegeBtn = new JButton("REFRESH LIST");
        refreshCollegeBtn.setBackground(accentColor);
        refreshCollegeBtn.setForeground(Color.BLACK);
        refreshCollegeBtn.setFocusPainted(false);
        refreshCollegeBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                refreshCollegeMouseClicked(evt);
            }
        });
        collegeTopPanel.add(refreshCollegeBtn);


        // Add New College Button
        JButton addNewCollegeBtn = new JButton("ADD NEW COLLEGE");
        addNewCollegeBtn.setBackground(accentColor);
        addNewCollegeBtn.setForeground(Color.BLACK);
        addNewCollegeBtn.setFocusPainted(false);
        addNewCollegeBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                neweCollegeMouseReleased(evt); // Opens the Add College dialog
            }
        });
        collegeTopPanel.add(addNewCollegeBtn);
        
        collegeListPanel.add(collegeTopPanel, BorderLayout.NORTH);

        collegeTable = new JTable();
        DefaultTableModel collegeTableModel = new DefaultTableModel(new Object[][] {}, new String[] { "College Code", "College Name" }) {
            boolean[] canEdit = new boolean[] { false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        collegeTable.setModel(collegeTableModel);
        collegeTable.setFont(tableFont);
        collegeTable.setForeground(fgLight);
        collegeTable.setBackground(bgMedium);
        collegeTable.setSelectionBackground(accentColor);
        collegeTable.setSelectionForeground(Color.BLACK);
        collegeTable.setRowHeight(24);
        collegeTable.setAutoCreateRowSorter(true);
        collegeTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                collegeTableMouseClicked(evt);
            }
        });
        JScrollPane collegeScrollPane = new JScrollPane(collegeTable);
        collegeListPanel.add(collegeScrollPane, BorderLayout.CENTER);

        // College details & action panel right side
        JPanel collegeDetailsPanel = new JPanel();
        collegeDetailsPanel.setPreferredSize(new Dimension(320, 0));
        collegeDetailsPanel.setBackground(bgMedium);
        collegeDetailsPanel.setLayout(new GridBagLayout());
        collegeDetailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

      
        JPanel collegeCodePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); 
        collegeCodePanel.setBackground(bgMedium);
        idLabel18 = new JLabel("COLLEGE CODE");
        idLabel18.setForeground(accentColor);
        idLabel18.setFont(labelFont);
        collegeCodePanel.add(idLabel18);

        collegeCodeC = new JTextField();
        collegeCodeC.setFont(fieldFont);
        collegeCodeC.setForeground(fgLight);
        collegeCodeC.setBackground(bgDark);
        collegeCodeC.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        collegeCodeC.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        collegeCodeC.setPreferredSize(new Dimension(140, 30)); // Width: 176, Height: 30
        collegeCodeC.setMaximumSize(new Dimension(140, 30));   // Ensure it doesn't exceed this size
        collegeCodePanel.add(collegeCodeC);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        collegeDetailsPanel.add(collegeCodePanel, gbc);

        JPanel collegeNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); 
        collegeNamePanel.setBackground(bgMedium);
        idLabel17 = new JLabel("NAME");
        idLabel17.setForeground(accentColor);
        idLabel17.setFont(labelFont);
        collegeNamePanel.add(idLabel17);

        collegeCodeN = new JTextField();
        collegeCodeN.setFont(fieldFont);
        collegeCodeN.setForeground(fgLight);
        collegeCodeN.setBackground(bgDark);
        collegeCodeN.setBorder(BorderFactory.createMatteBorder(0, 0, 7, 0, accentColor));
        collegeCodeN.setHorizontalAlignment(JTextField.CENTER); // Center text horizontally
        collegeCodeN.setPreferredSize(new Dimension(225, 30)); // Width: 176, Height: 30
        collegeCodeN.setMaximumSize(new Dimension(225, 30));   // Ensure it doesn't exceed this size
        collegeNamePanel.add(collegeCodeN);
        gbc.gridy++;
        collegeDetailsPanel.add(collegeNamePanel, gbc);

        JPanel collegeActionButtonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        collegeActionButtonsPanel.setBackground(bgMedium);

        editCollege = new JButton("EDIT");
        editCollege.setBackground(accentColor);
        editCollege.setForeground(Color.BLACK);
        editCollege.setFocusPainted(false);
        editCollege.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                editCollegeMouseClicked(evt);
            }
        });
        collegeActionButtonsPanel.add(editCollege);

        saveCollege = new JButton("SAVE");
        saveCollege.setBackground(accentColor);
        saveCollege.setForeground(Color.BLACK);
        saveCollege.setFocusPainted(false);
        saveCollege.setVisible(false);
        saveCollege.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                saveCollegeMouseClicked(evt);
            }
        });
        collegeActionButtonsPanel.add(saveCollege);

        deleteCollege = new JButton("DELETE");
        deleteCollege.setBackground(accentColor);
        deleteCollege.setForeground(Color.BLACK);
        deleteCollege.setFocusPainted(false);
        deleteCollege.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                deleteCollegeMouseClicked(evt);
            }
        });
        collegeActionButtonsPanel.add(deleteCollege);

        cancelCollege = new JButton("CANCEL");
        cancelCollege.setBackground(accentColor);
        cancelCollege.setForeground(Color.BLACK);
        cancelCollege.setFocusPainted(false);
        cancelCollege.setVisible(false);
        cancelCollege.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cancelCollegeMouseClicked(evt);
            }
        });
        collegeActionButtonsPanel.add(cancelCollege);

        gbc.gridy++;
        collegeDetailsPanel.add(collegeActionButtonsPanel, gbc);

        // Modify the collegeDetailsPanel
        JPanel collegeContainer = new JPanel();
        collegeContainer.setLayout(new BoxLayout(collegeContainer, BoxLayout.Y_AXIS)); // Stack components vertically
        collegeContainer.setBackground(bgDark);

        // Add the collegeDetailsPanel to the container
        collegeContainer.add(collegeDetailsPanel);

        // Add a spacer below the collegeDetailsPanel
        JPanel collegeSpacer = new JPanel();
        collegeSpacer.setBackground(bgDark); // Match the background color
        collegeSpacer.setPreferredSize(new Dimension(350, 400)); // Set the height of the spacer
        collegeContainer.add(collegeSpacer);

        // Add the container to the EAST region of the collegeListPanel
        collegeListPanel.add(collegeContainer, BorderLayout.EAST);

        
        ImageIcon collegeIcon = new ImageIcon(getClass().getResource("/SIS/com/icons/college.png"));

          // Optional: Scale the icon to fit nicely in the tab
        Image collegeIcons = collegeIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon scaledCollegeIcon = new ImageIcon(collegeIcons);
  
          // Add the tab with text, icon, and component
        tabbedPane.addTab("Colleges      ", scaledCollegeIcon, collegeListPanel);

    }//END:initComponents


    private void cancelButtonAddCMouseClicked(java.awt.event.MouseEvent evt) {
        AddCollegeDialog.dispose();
    }

    private void cancelButtonAddPMouseClicked(java.awt.event.MouseEvent evt) {
        AddProgramDialog.dispose();
    }

    private void addButtonCMouseClicked(java.awt.event.MouseEvent evt) {
        Components.addButtonCollegeDialog();
    }

    private void addButtonPMouseClicked(java.awt.event.MouseEvent evt) {
        Components.addButtonProgramDialog();
    }

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {
        firstNameField.setText(null);
        lastNameField.setText(null);
        comboBoxP.removeAllItems();
        AddStudentDialog.dispose();
    }


    private void comboBoxCCStudentItemStateChanged(java.awt.event.ItemEvent evt) {
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if("Add New".equals((String) comboBoxCCStudent.getSelectedItem())) {
                AddCollegeDialog.setVisible(true);
            }
            Components.loadProgramCom();
        }
    }

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Components.confirmButtonStudentDialog();
    }

    private void newStudentMouseReleased(java.awt.event.MouseEvent evt) {
        Components.showStudentDialog();
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        Components.formWindowActivated();
    }

    private void newProgramMouseReleased(java.awt.event.MouseEvent evt) {
        AddCollegeDialog.setLocationByPlatform(true);
        Components.loadCollegeToProgramDialog();
    }

    private void neweCollegeMouseReleased(java.awt.event.MouseEvent evt) {
        AddCollegeDialog.setLocationByPlatform(true);
        AddCollegeDialog.setVisible(true);
    }

    private void comboBoxYItemStateChanged(java.awt.event.ItemEvent evt) {
        if(comboBoxY.getSelectedItem() == null){
            return;
        }
        String year = (String) comboBoxY.getSelectedItem();
        if(year.length() == 4){
            String num = Components.genNum();
            idFieldNS.setText(num);
        }
    }

    private void comboBoxPItemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if ("Add New".equals((String) comboBoxP.getSelectedItem())) {
                AddProgramDialog.setVisible(false);
                Components.loadCollegeToProgramDialog();
            }
        }
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        Components.loadStudentData();
        Components.clearStudentFields();
    }

    private void refreshProgramMouseClicked(java.awt.event.MouseEvent evt) {
        Components.loadProgramData();
        Components.clearProgramFields();
    }

    private void searchProgramKeyReleased(java.awt.event.KeyEvent evt) {
        Components.searchProgram();
    }

    private void saveProgramMouseClicked(java.awt.event.MouseEvent evt) {
        Components.saveProgramClicked();
    }

    private void editProgramMouseClicked(java.awt.event.MouseEvent evt) {
        Components.editProgram();
    }

    private void cancelProgramMouseClicked(java.awt.event.MouseEvent evt) {
        Components.cancelProgramClicked();
    }

    private void deleteProgramMouseClicked(java.awt.event.MouseEvent evt) {
        Components.deleteProgramClicked();
    }

    private void programTableMouseClicked(java.awt.event.MouseEvent evt) {
        Components.getProgramTableRowData();
    }

    private void refreshCollegeMouseClicked(java.awt.event.MouseEvent evt) {
        Components.loadCollegeData();
        Components.clearCollegeFields();
    }

    private void collegeTableMouseClicked(java.awt.event.MouseEvent evt) {
        Components.getCollegeTableRowData();
    }

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {
        Components.searchStudent();
    }

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {
        Components.cancelStudentClicked();
    }

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {
        Components.deleteStudentClicked();
    }

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Components.saveStudentClicked();
    }

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Components.editStudentClicked();
    }

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {
        Components.getStudentTableRowData();
    }

    private void deleteCollegeMouseClicked(java.awt.event.MouseEvent evt) {
        Components.deleteCollegeClicked();
    }

    private void saveCollegeMouseClicked(java.awt.event.MouseEvent evt) {
        Components.saveCollegeClicked();
    }

    private void editCollegeMouseClicked(java.awt.event.MouseEvent evt) {
        Components.editCollegeClicked();
    }

    private void cancelCollegeMouseClicked(java.awt.event.MouseEvent evt) {
        Components.cancelCollegeClicked();
    }

    private void searchFieldCollegeKeyReleased(java.awt.event.KeyEvent evt) {
        Components.searchCollege();
    }

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
    public static javax.swing.JLabel genderCheck;
    public static javax.swing.JTextField genderField;
    public static javax.swing.ButtonGroup genderG;
    public static javax.swing.ButtonGroup genderGroup;
    public static javax.swing.JLabel idCheck;
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
    public static javax.swing.JPanel programListPanel;
    public static javax.swing.JLabel programNameCheck;
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
