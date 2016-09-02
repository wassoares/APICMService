package org.soarescontabil.model.aliquot;

import org.soarescontabil.model.Aliquota;
import org.soarescontabil.model.Uf;

public class AliquotaExterior implements Aliquota {

	@Override
	public double getValorOrigem() {
		return 4;
	}

	@Override
	public double getValorDestino(Uf uf) {
		return 4;
	}

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		return 4;
	}
	
}