import java.awt.*;
import javax.swing.JList;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
public class AddressBookGUI extends JFrame implements ActionListener {

	private JFrame frame; 
	private  Container contentPane;
	private  JMenuBar menuBar;
	private  JMenu addressBookMenu;
	private  JMenu buddyInfoMenu;
	private  JMenuItem create;
	private  JMenuItem save;
	private  JMenuItem display;
	private  JMenuItem add;
	private AddressBook contactList; 
	private JTextArea textArea;
	private JOptionPane optionPane; 
	private JScrollPane scrollPane;
	JList <BuddyInfo> list;
	JList <String> list2;
	
	
	public AddressBookGUI()  {
		//frame = new JFrame("AddressBook");
		//contentPane = frame.getContentPane();
		//contentPane.setLayout(new BorderLayout());
		
		setTitle("AddressBook");
		menuBar = new JMenuBar();
	
		setJMenuBar(menuBar);
		addressBookMenu = new JMenu("AddressBook");
		buddyInfoMenu = new JMenu("Contacts");
		create = new JMenuItem("Create AddressBook");
		
		create.addActionListener(e -> {
			contactList = new AddressBook();
			
			save.setEnabled(true);
			display.setEnabled(true);
			add.setEnabled(true);
		});
		
		save = new JMenuItem("Save");
		save.addActionListener(e -> {
			try {
				contactList.save2File();
				//transfer the main stuff back from addressbook
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		save.setEnabled(false);
		
		display = new JMenuItem("Display contacts");
		display.addActionListener(this);
		display.setEnabled(false);
		
		add = new JMenuItem("Add contacts");
		add.addActionListener(this);
		add.setEnabled(false);
		menuBar.add(addressBookMenu);
		menuBar.add(buddyInfoMenu);
		addressBookMenu.add(create);
		addressBookMenu.add(save);
		addressBookMenu.add(display);
		buddyInfoMenu.add(add);
		
		/*scrollPane = new JScrollPane();
		 DefaultListModel<String> testing = new DefaultListModel<String>();
		 testing.addElement("Deaton");
		 testing.addElement("This is a test");
			list = new JList<>(testing);  //contactList.getList()
			scrollPane.add(list);
			
			
		this.add(new JScrollPane(list));
		scrollPane.setVisible(true);*/
		
		/*textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.NORTH);
		//textArea.setEditable(false);*/
		optionPane = new JOptionPane();
		
		
		
		
		//frame.pack();
		/*frame.*/setResizable(true);
		/*/frame.*/setSize(500, 500);
		/*/frame.*/setPreferredSize(new Dimension(1500,1500));
		/*frame.*/setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		e.getSource();
	 if(e.getSource()== display) {
		
		 DefaultListModel<String> testing = new DefaultListModel<String>();
		 testing.addElement("Deaton");
		 testing.addElement("This is a test");
			//list = new JList<>(testing);  //contactList.getList()
		 list2 = new JList<>(testing);
			this.add(new JScrollPane(list2));
			
		}else if(e.getSource()== add) {
			String name = optionPane.showInputDialog("Enter name");
			String address = optionPane.showInputDialog("Enter address");
			String number = optionPane.showInputDialog("Enter phone number");
			BuddyInfo buddy = new BuddyInfo(name, address, number);
			/*buddy.setName(name);
			buddy.setAddress(address);
			buddy.setPhoneNumber(number);*/
			contactList.addBuddy(buddy);
		}
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBookGUI gui = new AddressBookGUI();
		
	}
	
	

}
