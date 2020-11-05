/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_noelgonzalez;

import java.util.Objects;

/**
 *
 * @author pep
 */
public class Estudiant {
    
        private String nom;
        private double primerParcial;
        private double segundoParcial;
        private double tercerParcial;

    public Estudiant(String nom, double primerParcial, double segundoParcial, double tercerParcial) {
        this.nom = nom;
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.tercerParcial = tercerParcial;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(double primerParcial) {
        this.primerParcial = primerParcial;
    }

    public double getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public double getTercerParcial() {
        return tercerParcial;
    }

    public void setTercerParcial(double tercerParcial) {
        this.tercerParcial = tercerParcial;
    }

    @Override
    public String toString() {
        return "Estudiant{" + "nom=" + nom + ", primerParcial=" + primerParcial + ", segundoParcial=" + segundoParcial + ", tercerParcial=" + tercerParcial + '}';
    }

    /**
     * Aquest mètode retorna true si dos estudians són iguals: mateix nom i 
     * notes. Altrament retorna false
     * @param obj
     * @return true si dos estudiants són iguals. false si dos estudiants són
     * diferents
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiant other = (Estudiant) obj;
        if (Double.doubleToLongBits(this.primerParcial) != Double.doubleToLongBits(other.primerParcial)) {
            return false;
        }
        if (Double.doubleToLongBits(this.segundoParcial) != Double.doubleToLongBits(other.segundoParcial)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tercerParcial) != Double.doubleToLongBits(other.tercerParcial)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    
    
}