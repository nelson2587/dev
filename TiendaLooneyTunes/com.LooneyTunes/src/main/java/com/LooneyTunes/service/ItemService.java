/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LooneyTunes.service;

import com.LooneyTunes.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nelson
 */
public interface ItemService {
    List<Item>listaItems = new ArrayList<>();
    public List<Item>gets();// odtener todos los items.
    public Item get(Item item);
    public void delete(Item item);
    public void save(Item item);
    public void actualiza(Item item);
    public void facturar();
}
