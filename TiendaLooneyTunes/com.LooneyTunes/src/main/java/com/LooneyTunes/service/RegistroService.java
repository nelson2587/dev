/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LooneyTunes.service;

import com.LooneyTunes.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Nelson
 */
public interface RegistroService {
  public Model activar (Model model,String usurio,String clave);  
  public Model crearUsuario (Model model,Usuario usurio) throws MessagingException;
  public void activar (Usuario usuario, MultipartFile imagenFile);
  public Model recordarUsuario (Model model,Usuario usurio) throws MessagingException;
  
}
