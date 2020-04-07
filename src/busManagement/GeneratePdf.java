/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busManagement;
import Model.Passenger;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Stream;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
/**
 *
 * @author FAWAD KAMAL
 */
public class GeneratePdf {

    static void pdf(TextField bNum, String tCSrc, String tCDest, double totalFare, ObservableList<Passenger> passengerList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void pdf(TextField bNum, String tCSrc, String tCDest, double totalFare) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void pdf(String bNum, String src, String dest, double tFare) throws DocumentException, FileNotFoundException {
   
    Document document = new Document();
    try
    {
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Ticket.pdf"));
        document.open();
 
        PdfPTable table = new PdfPTable(4); // 3 columns.
        table.setWidthPercentage(100); //Width 100%
        table.setSpacingBefore(10f); //Space before table
        table.setSpacingAfter(10f); //Space after table
 
        //Set Column widths
        float[] columnWidths = {1f,1f,1f,1f};
        table.setWidths(columnWidths);
 
        PdfPCell cell1 = new PdfPCell(new Paragraph("BRT TICKET"));
        cell1.setColspan(4);
        PdfPCell cell2 = new PdfPCell(new Paragraph("TICKET_ID"));
        PdfPCell cell3 = new PdfPCell(new Paragraph());
        PdfPCell cell4 = new PdfPCell(new Paragraph("NAME"));
          PdfPCell cell5 = new PdfPCell(new Paragraph(""));
        PdfPCell cell6 = new PdfPCell(new Paragraph("AGE"));
          PdfPCell cell7 = new PdfPCell(new Paragraph(""));
        PdfPCell cell8 = new PdfPCell(new Paragraph("GENDER"));
          PdfPCell cell9 = new PdfPCell(new Paragraph(""));
        PdfPCell cell10 = new PdfPCell(new Paragraph("ID"));
          PdfPCell cell11 = new PdfPCell(new Paragraph(""));
        PdfPCell cell12 = new PdfPCell(new Paragraph("BUS_NUMBER"));
          PdfPCell cell13 = new PdfPCell(new Paragraph(bNum));
        PdfPCell cell14 = new PdfPCell(new Paragraph("SRC"));
          PdfPCell cell15 = new PdfPCell(new Paragraph(src));
        PdfPCell cell16 = new PdfPCell(new Paragraph("DEST"));
          PdfPCell cell17 = new PdfPCell(new Paragraph(dest));
        PdfPCell cell18 = new PdfPCell(new Paragraph("TOTAL FARE"));
          PdfPCell cell19 = new PdfPCell(new Paragraph((float) tFare));
        
        
        cell1.setPaddingLeft(10);
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell1.setPadding(10f);
        cell2.setPadding(10f);
        cell3.setPadding(10f);
        cell4.setPadding(10f);
        cell5.setPadding(10f);
        cell6.setPadding(10f);
        cell7.setPadding(10f);
        cell8.setPadding(10f);
        cell9.setPadding(10f);
        cell10.setPadding(10f);
        cell11.setPadding(10f);
        cell12.setPadding(10f);
        cell13.setPadding(10f);
        cell14.setPadding(10f);
        cell15.setPadding(10f);
        cell16.setPadding(10f);
        cell17.setPadding(10f);
        cell18.setPadding(10f);
        //To avoid having the cell border and the content overlap, if you are having thick cell borders
        //cell1.setUserBorderPadding(true);
        //cell2.setUserBorderPadding(true);
        //cell3.setUserBorderPadding(true);
 
        table.addCell(cell1);
        
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
        table.addCell(cell5);
        table.addCell(cell6);
        table.addCell(cell7);
        table.addCell(cell8);
        table.addCell(cell9);
        table.addCell(cell10);
        table.addCell(cell11);
        table.addCell(cell12);
        table.addCell(cell13);
        table.addCell(cell14);
        table.addCell(cell15);
        table.addCell(cell16);
        table.addCell(cell17);
        table.addCell(cell18);

        document.add(table);
 
        document.close();
        writer.close();
    } catch (Exception e)
    {
        e.printStackTrace();
    }
    
}
}