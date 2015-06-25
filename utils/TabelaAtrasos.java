package utils;

import java.util.ArrayList;
import utils.EmprestimoWrapper;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TabelaAtrasos implements TableModel {
	
	private ArrayList<EmprestimoWrapper> atrasos;
	private String[][] tabelados;
	private String[] cabecalho = {"Código do usuário", "Código do exemplar"};

	public TabelaAtrasos(ArrayList<EmprestimoWrapper> atrasos){
		this.atrasos = atrasos;
		tabelados = new String[atrasos.size()][2];
		preparaTabela();
	}
	
	private void preparaTabela(){
		for(int i = 0; i < atrasos.size(); i++){
			tabelados[i][0] = atrasos.get(i).usuario;
			tabelados[i][1] = Integer.toString(atrasos.get(i).exemplar);
		}
	}
	
	@Override
	public void addTableModelListener(TableModelListener arg0) {
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		return String.class;
	}

	@Override
	public int getColumnCount() {
		return tabelados[0].length;
	}

	@Override
	public String getColumnName(int arg0) {
		return cabecalho[arg0];
	}

	@Override
	public int getRowCount() {
		return tabelados.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return tabelados[arg0][arg1];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
	}
	
}