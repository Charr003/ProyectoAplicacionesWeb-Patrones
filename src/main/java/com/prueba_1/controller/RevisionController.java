/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba_1.controller;

/**
 *
 * @author XPC
 */
import com.prueba_1.domain.Revision;
import com.prueba_1.service.RevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j 
@RequestMapping("/revision")
public class RevisionController {
   
    @Autowired
    private RevisionService revisionService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var revisions = revisionService.getRevisiones(false);
        model.addAttribute("revisions", revisions); // Se asocia lista revision a la variable, toda la info se usa en la vista
        model.addAttribute("totalRevisiones", revisions.size()); // Se asocia un dato a la variable para la vista
        return "/revision/listado";
    }
    
    @GetMapping("/nuevo")
    public String revisionNuevo(Revision revision) {
           return "/revision/modifica";
       }



       @PostMapping("/guardar")
       public String revisionGuardar(Revision revision,
               @RequestParam("imagenFile") MultipartFile imagenFile) {        
           revisionService.save(revision);
           return "redirect:/revision/listado";
       }

       @GetMapping("/eliminar/{idRevision}")
       public String revisionEliminar(Revision revision) {
           revisionService.delete(revision);
           return "redirect:/revision/listado";
       }

       @GetMapping("/modificar/{idRevision}")
       public String revisionModificar(Revision revision, Model model) {
           revision = revisionService.getRevision(revision);
           model.addAttribute("revision", revision);
           return "/revision/modifica";
       } 
    
}
