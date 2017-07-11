package es.cic.taller.ejercicio09;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.TextField;

import es.cic.taller.ejercicio09.mus.Tapete;

public class TapeteForm extends FormLayout {
	private TextField carta1 = new TextField("Carta 1:");
	private TextField carta2 = new TextField("Carta 2:");
	private TextField carta3 = new TextField("Carta 3:");
	private TextField carta4 = new TextField("Carta 4:");
	
	private Image imagen1 = new Image("Ejemplo imagen", getImageResource("document.png"));
	
	private MyUI myUI;
	
	public TapeteForm(MyUI myUI) {
		this.myUI = myUI;
		System.out.println("prueba de cambio");
		addComponents(carta1, carta2, carta3, carta4, imagen1);
	}
	
	
	
	
	private Resource getImageResource(String recurso) {
		String basepath = VaadinService.getCurrent()
                .getBaseDirectory().getAbsolutePath();
		FileResource resource = new FileResource(new File(basepath +
                "/images/" + recurso));
        return resource;
	}




	/* Esto es un comentario */
	public void setTapete(Tapete tapete) {
		carta1.setValue(tapete.getCarta1().toString());
		carta2.setValue(tapete.getCarta2().toString());
		carta3.setValue(tapete.getCarta3().toString());
		carta4.setValue(tapete.getCarta4().toString());
		imagen1.setSource(getImageResource("document2.png"));
		imagen1.setWidth("100px");
		imagen1.setHeight("200px");
	}
	
}
