package br.usjt.ads20.appfilmes;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    private ImageView posterFilme;
    private TextView nomeFilme, detalheFilme;

    public ViewHolder(ImageView posterFilme, TextView nomeFilme, TextView detalheFilme) {
        this.posterFilme = posterFilme;
        this.nomeFilme = nomeFilme;
        this.detalheFilme = detalheFilme;
    }

    public ImageView getPosterFilme() {
        return posterFilme;
    }

    public void setPosterFilme(ImageView posterFilme) {
        this.posterFilme = posterFilme;
    }

    public TextView getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(TextView nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public TextView getDetalheFilme() {
        return detalheFilme;
    }

    public void setDetalheFilme(TextView detalheFilme) {
        this.detalheFilme = detalheFilme;
    }
}
