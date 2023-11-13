package com.example.edubotv2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pdfview.PDFView;

public class PantallaVisualizarPdf4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_visualizar_pdf4);

        PDFView pdfView = findViewById(R.id.vistaPdf4);
        pdfView.fromAsset("libro-comprension4.pdf")
                .show();
    }
}