
package utils.pdf;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.Image;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.TextAlignment;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Header implements IEventHandler{
    private String titulo;
    public Header(String titulo){
        this.titulo = titulo;
    }
    @Override
    public void handleEvent(Event event) {
        try {
            PdfDocumentEvent docEvent = (PdfDocumentEvent)event;
            PdfDocument pdf = docEvent.getDocument();
            PdfPage page = docEvent.getPage();
            Rectangle pageSize = page.getPageSize();
            
            Canvas canvas = new Canvas(new PdfCanvas(page), pageSize);
            canvas.setFontSize(15);
            
            //LOGO
            URL urlImage = this.getClass().getResource("/img/java2.jpg");
            ImageData data = ImageDataFactory.create(urlImage);
            Image image = new Image(data);
            image.setWidth(90);

            //TITULO
            canvas.showTextAligned(titulo, pageSize.getWidth()/2, pageSize.getTop() - 60, TextAlignment.CENTER);
            canvas.setUnderline();
            
            canvas.add(image);
            canvas.close();
        } catch (Exception ex) {
            Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
