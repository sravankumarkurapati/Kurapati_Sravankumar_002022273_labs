/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {

    private String name;
    private int price;
    private int id;
    private ImageIcon productLogo;

    private ArrayList<Feature> features;

    private static int count = 0;

    public Product() {
        count++;
        id = count;

        features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ImageIcon getProductLogo() {
        return productLogo;
    }

    public void setProductLogo(ImageIcon productLogo) {
        this.productLogo = productLogo;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return name;
    }

    public Feature addNewFeature(String featureName) {
        Feature newFeature = new Feature(this);
        newFeature.setName(featureName);
        newFeature.setValue("Type Value here");

        // Add to product's feature list
        this.getFeatures().add(newFeature);
        return new Feature(this);
    }

}
