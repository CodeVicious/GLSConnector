package com.codevicious.TaffiGLSConverter.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		contentPane.add(tabbedPane);
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setToolTipText("Selezionare il csv da inviare a GLS");
		fileChooser.setFileSelectionMode(0);
		fileChooser.setDialogTitle("Seleziona il CSV");
		fileChooser.setAcceptAllFileFilterUsed(false);
		tabbedPane.addTab("Lista spedizioni", null, fileChooser, null);
		
		JLabel label = new JLabel("Sistema di Generazione\nTaffi -> GLX");
		tabbedPane.addTab("New tab", null, label, null);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		FileFilter filter = new FileNameExtensionFilter("CSV Taffi file", "csv");
	}

}
