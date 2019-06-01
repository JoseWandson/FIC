import java.util.Objects;

public class Valores implements ValoresITF {

	private Integer[] valores = new Integer[10];

	@Override
	public boolean ins(int v) {
		int size = size();
		if (v > 0 && size < 10) {
			valores[size] = v;
			return true;
		}
		return false;
	}

	@Override
	public int del(int i) {
		int valorRemovido = -1;
		if (i >= 0 && size() > 0 && Objects.nonNull(valores[i])) {
			valorRemovido = valores[i];
			for (; i < size(); i++) {
				valores[i] = valores[i + 1];
			}
		}
		return valorRemovido;
	}

	@Override
	public int size() {
		int contador = 0;
		for (Integer valor : valores) {
			if (Objects.nonNull(valor)) {
				contador++;
			}
		}
		return contador;
	}

	@Override
	public double mean() {
		int size = size();
		if (size == 0) {
			return -1;
		}
		if (size == 1) {
			return valores[0];
		}
		int media = 0;
		for (int i = 0; i < size(); i++) {
			media += valores[i];
		}
		return media / size;
	}

	@Override
	public int greater() {
		int size = size();
		if (size == 0) {
			return -1;
		}
		if (size == 1) {
			return valores[0];
		}
		int maior = 0;
		for (int i = 0; i < size(); i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
		}
		return maior;
	}

	@Override
	public int lower() {
		int size = size();
		if (size == 0) {
			return -1;
		}
		if (size == 1) {
			return valores[0];
		}
		int menor = valores[0];
		for (int i = 1; i < size(); i++) {
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}
		return menor;
	}

}
