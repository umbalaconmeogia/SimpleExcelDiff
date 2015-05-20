package com.chauhai.simpleexceldiff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class SimpleExcelDiff {

	private JFrame frmSimpleExcelDiff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleExcelDiff window = new SimpleExcelDiff();
					window.frmSimpleExcelDiff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleExcelDiff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleExcelDiff = new JFrame();
		frmSimpleExcelDiff.setTitle("Simple Excel Diff");
		frmSimpleExcelDiff.setBounds(100, 100, 450, 300);
		frmSimpleExcelDiff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleExcelDiff.getContentPane().setLayout(new BorderLayout(0, 0));
	}

}
