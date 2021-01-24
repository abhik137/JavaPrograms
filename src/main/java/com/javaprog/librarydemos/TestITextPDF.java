package com.javaprog.librarydemos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;

public class TestITextPDF
{
    public static void main(String[] args) throws FileNotFoundException, DocumentException
    {
        String pdfPath = "/tmp/test.pdf";
        Document document = new Document();
//        document.setPageSize(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document,
                        new FileOutputStream(pdfPath));
        document.open();
        Date date = new Date();
        String dateFormatted = new SimpleDateFormat("d MMM, yyyy").format(date);
        String boardName = "My Awesome Board";
        Font ffont = new Font(Font.FontFamily.UNDEFINED, 20, Font.NORMAL);
        
        if(null != boardName)
        {
            Phrase boardNameHeader = new Phrase(boardName, ffont);
            ColumnText.showTextAligned(
                writer.getDirectContent(), Element.ALIGN_LEFT, boardNameHeader, 
                document.left(), document.top(), 0
            );
        }
        
        Phrase timestampHeader = 
            new Phrase(dateFormatted.toString(), ffont);
        ColumnText.showTextAligned(
            writer.getDirectContent(), Element.ALIGN_RIGHT, timestampHeader, 
            document.right(), document.top(), 0
        );
        document.close();
        System.out.println("done");
    }
}
