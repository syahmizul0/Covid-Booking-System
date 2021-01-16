package frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.Flow;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import SQLBackend.SQL;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class Frame extends JFrame {
    public Frame()
    {
        initComponents();
    }

    private void initComponents() {
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        panel4 = new JPanel();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        buttongroup = new ButtonGroup();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        scrollPane1 = new JScrollPane();
        label3 = new JLabel();
        panel2 = new JPanel();
        scrollPane2 = new JScrollPane();
        textPane1 = new JTextPane();
        listModel = new DefaultListModel();
        list1 = new JList(listModel);
        panel5 = new JPanel();
        model = new UtilDateModel();
        datePanel = new JDatePanelImpl(model);
        datePicker = new JDatePickerImpl(datePanel);
        label6 = new JLabel();
        sql = new SQL();
        sqlarr = new Vector<Vector>();
        sqlarr = sql.SQL();
        updatebutton = new JButton("Update");
        refreshbutton = new JButton("Refresh");
        table1 = new JTable();
        tableModel = (DefaultTableModel) table1.getModel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        

        //======== tabbedPane1 ========
        {
            tabbedPane1.setBackground(Color.lightGray);
            tabbedPane1.setBorder(new BevelBorder(BevelBorder.RAISED));

            //======== panel1 ========
            {
                panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
                        EmptyBorder(0,0,0,0), "",javax.swing.border.TitledBorder.CENTER,javax.swing
                        .border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12),
                        java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))
                throw new RuntimeException();}});
                panel1.setLayout(null);

                //======== panel3 ========
                {
                    panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

                    //---- label1 ----
                    label1.setText("First Name");
                    label1.setFont(new Font("Tahoma", label1.getFont().getStyle(), 11));
                    panel3.add(label1);

                    //---- textField1 ----
                    textField1.setColumns(23);
                    panel3.add(textField1);

                    //---- label2 ----
                    label2.setText("Last Name");
                    panel3.add(label2);

                    //---- textField2 ----
                    textField2.setColumns(23);
                    panel3.add(textField2);
                }
                panel1.add(panel3);
                panel3.setBounds(new Rectangle(new Point(60, 60), panel3.getPreferredSize()));

                //======== panel4 ========
                {
                    panel4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

                    //---- label4 ----
                    label4.setText("IC Number");
                    label4.setFont(new Font("Tahoma", label4.getFont().getStyle(), 11));
                    panel4.add(label4);

                    //---- textField3 ----
                    textField3.setColumns(23);
                    panel4.add(textField3);

                    //---- label5 ----
                    label5.setText("Gender");
                    panel4.add(label5);

                    //---- radioButton1 ----
                    radioButton1.setText("Male");

                    panel4.add(radioButton1);

                    //---- radioButton2 ----
                    radioButton2.setText("Female");
                    panel4.add(radioButton2);

                    //---- radioButton3 ----
                    radioButton3.setText("Others");
                    panel4.add(radioButton3);

                    buttongroup.add(radioButton1);
                    buttongroup.add(radioButton2);
                    buttongroup.add(radioButton3);

                }
                panel1.add(panel4);
                panel4.setBounds(60, 120, 700, 40);

                //======== scrollPane1 ========
                {
                    //======== list1 ========
                    {
                        listModel.addElement("Close contacts has COVID-19");
                        listModel.addElement("Went to a red zone before");
                        listModel.addElement("Recently travelled to another country");
                        listModel.addElement("Attended large social or mass gatherings");
                        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                    }
                    scrollPane1.setViewportView(list1);
                }
                panel1.add(scrollPane1);
                scrollPane1.setBounds(65, 240, 270, 100);

                //---- label3 ----
                label3.setText("Select these if true : ( Multi select with CTRL ) ");
                panel1.add(label3);
                label3.setBounds(new Rectangle(new Point(65, 215), label3.getPreferredSize()));

                //======== panel5 ========
                {
                    panel5.setLayout(new FlowLayout());
                }

                label6.setText("Date of Booking : ");

                panel5.add(updatebutton);
                panel5.add(label6);
                panel5.add(datePicker);
                panel1.add(panel5);
                panel5.setBounds(380, 240, 350, 150);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            updatebutton.setBounds(570,400,100,30);
            updatebutton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    sql.updateData(textField1.getText(),textField2.getText(),textField3.getText());

                }
            });
            
            panel1.add(updatebutton);
          
            tabbedPane1.addTab("Book", panel1);

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //======== scrollPane2 ========
                {
                    //======== table1 ========
                	{
                		sql = new SQL();
                		sqlarr = sql.SQL();
          
                		tableModel.setRowCount(0);
                		for(String col : table1_column)
                		{
                			tableModel.addColumn(col);
                		}
                		
                		for(Vector vec : sqlarr)
                		{
                			
                			tableModel.addRow(vec);
                		}

                        table1.setEnabled(true);
                        table1.setModel(tableModel);
                        
                    }
                    scrollPane2.setViewportView(table1);
                    refreshbutton.setBounds(570,430,100,30);
                    refreshbutton.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        	{
                        		sql = new SQL();
                        		sqlarr = sql.SQL();
                  
                        		tableModel.setRowCount(0);

                        		
                        		for(Vector vec : sqlarr)
                        		{
                        			
                        			tableModel.addRow(vec);
                        		}

                                table1.setEnabled(true);
                                table1.setModel(tableModel);
                            }
                        	  

                        }
                    });
                }
                
                panel1.add(refreshbutton);
                panel2.add(scrollPane2);
                scrollPane2.setBounds(0, 0, 760, 470);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            tabbedPane1.addTab("View Available Dates", panel2);
        }
        contentPane.add(tabbedPane1, BorderLayout.CENTER);
        setTitle("Covid Booking System");
        pack();
        setVisible(true);
        setResizable(false);

        setLocationRelativeTo(getOwner());
        
    }

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel3;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JPanel panel4;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private ButtonGroup buttongroup;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JScrollPane scrollPane1;
    private JList list1;
    private JLabel label3;
    private JPanel panel2;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JTextPane textPane1;
    private DefaultListModel listModel;
    private UtilDateModel model;
    private JDatePanelImpl datePanel;
    private JDatePickerImpl datePicker;
    private JPanel panel5;
    private JLabel label6;
    private String[] table1_column = {"ID","First Name","Last Name","IC Number"};
    private String[][] data ;
    private SQL sql ;
    private Vector<Vector> sqlarr;
    private JButton updatebutton;
    private JButton refreshbutton;
    private DefaultTableModel tableModel;

}
