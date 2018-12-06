package view;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame {
	
		private JLabel lblSortingMethods;
		private JLabel lblSearchMethods;
		private JLabel lblComparisonTypes;
		private JComboBox<String> cbxFirstOrdinationMethod;		
		private JComboBox<String> cbxSecondOrdinationMethod;
		private JComboBox<String> cbxThirdOrdinationMethod;
		private JComboBox<String> cbxFourthOrdinationMethod;
		private JComboBox<String> cbxFirstSearchMethod;	
		private JComboBox<String> cbxSecondSearchMethod;
		private JComboBox<String> cbxThirdSearchMethod;
		private JCheckBox ckbTime;
		private JCheckBox ckbExchanges;
		private JCheckBox cbkComparisons;
		private JButton btnProcess;
		
		private String[] OrdinationMethods = {"- Selecione -","Insertion Sort","Selection Sort","BubbleSort",
				"Comb Sort","MergeSort","HeapSort","QuickSort","RadixSort","TimSort","CountingSort"};
		
		private String[] SearchMethods = {"- Selecione -","Pesquisa binária","Busca Linear","BogoBusca(BogoSort)"};
		
	public MenuView() {
		
		setSize(560, 310);
		setTitle("Menu");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		CreateComponents();
	}
	
	private void CreateComponents() {
		
//		================= Label's ====================
		lblSortingMethods =  new JLabel("Métodos de Ordenação:");
		lblSortingMethods.setBounds(5, 0, 150,45);
		getContentPane().add(lblSortingMethods);
		
		lblSearchMethods = new JLabel("Métodos de Pesquisa:");
		lblSearchMethods.setBounds(5, 75, 150, 45);
		getContentPane().add(lblSearchMethods);
		
		lblComparisonTypes = new JLabel("Tipos de Comparação:");
		lblComparisonTypes.setBounds(5, 150, 150, 45);
		getContentPane().add(lblComparisonTypes);
		
//		================= ComboBox ===================
		cbxFirstOrdinationMethod = new JComboBox<>(OrdinationMethods);
		cbxFirstOrdinationMethod.setBounds(15, 50, 120, 25);
		getContentPane().add(cbxFirstOrdinationMethod);
		
		cbxSecondOrdinationMethod = new JComboBox<>(OrdinationMethods);
		cbxSecondOrdinationMethod.setBounds(150, 50, 120, 25);
		getContentPane().add(cbxSecondOrdinationMethod);
		
		cbxThirdOrdinationMethod = new JComboBox<>(OrdinationMethods);
		cbxThirdOrdinationMethod.setBounds(285, 50, 120, 25);
		getContentPane().add(cbxThirdOrdinationMethod);
		
		cbxFourthOrdinationMethod = new JComboBox<>(OrdinationMethods);
		cbxFourthOrdinationMethod.setBounds(420, 50, 120, 25);
		getContentPane().add(cbxFourthOrdinationMethod);
		
		cbxFirstSearchMethod = new JComboBox<>(SearchMethods);
		cbxFirstSearchMethod.setBounds(15, 120, 120, 25);
		getContentPane().add(cbxFirstSearchMethod);
		
		cbxSecondSearchMethod = new JComboBox<>(SearchMethods);
		cbxSecondSearchMethod.setBounds(150, 120, 120, 25);
		getContentPane().add(cbxSecondSearchMethod);
		
		cbxThirdOrdinationMethod = new JComboBox<>(SearchMethods);
		cbxThirdOrdinationMethod.setBounds(285, 120, 120, 25);
		getContentPane().add(cbxThirdOrdinationMethod);
		
//		================= CheckBox ===================
		ckbTime = new JCheckBox("Tempo de execução");
		ckbTime.setSelected(false);
		ckbTime.setBounds(10, 190, 150, 25);
		getContentPane().add(ckbTime);
		
		ckbExchanges = new JCheckBox("Número de trocas");
		ckbExchanges.setSelected(false);
		ckbExchanges.setBounds(170, 190, 150, 25);
		getContentPane().add(ckbExchanges);
		
		cbkComparisons = new JCheckBox("Número de trocas");
		cbkComparisons.setSelected(false);
		cbkComparisons.setBounds(330, 190, 150, 25);
		getContentPane().add(cbkComparisons);
//		================== Button ===================
		btnProcess = new JButton("Gerar Relatório");
		btnProcess.setBounds(170, 230, 200, 30);
		getContentPane().add(btnProcess);
		btnProcess.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void main(String[] args) {
		new MenuView().setVisible(true);
	}

}
