package com.company;

public class Coche {

    private int numRuedas;
    private String nombre;
    private double velocidad=0;
    private int motor;
    private int largo;
    private int ruedas;
    private int ancho;
    private int peso_coche;
    private boolean asientos_cuero, climatizador;
    private String color;

    public Coche(){

        motor=1400;
        largo=1890;
        ruedas=4;
        ancho=250;
        peso_coche=480;

    }

    // getter y setter
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeso_coche() {
        return peso_coche;
    }

    public void setPeso_coche(int peso_coche) {
        this.peso_coche = peso_coche;
    }

    public boolean isAsientos_cuero() {
        return asientos_cuero;
    }

    public void setAsientos_cuero(boolean asientos_cuero) {
        this.asientos_cuero = asientos_cuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString

    @Override
    public String toString() {
        return "Coche{" +
                "numRuedas=" + numRuedas +
                ", nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                ", motor=" + motor +
                ", largo=" + largo +
                ", ruedas=" + ruedas +
                ", ancho=" + ancho +
                ", peso_coche=" + peso_coche +
                ", asientos_cuero=" + asientos_cuero +
                ", climatizador=" + climatizador +
                ", color='" + color + '\'' +
                '}';
    }

    public String dime_informacion_generales(){ // getter para dar datos generales

        return "la plataforma del vehiculo tiene " + ruedas + " ruedas " +
                " . Mide un " + largo/1000 + " metros con un ancho de " + ancho +
                " cm y un peso de coche de "  + peso_coche + " kg ";
    }

    public void establece_color(String color_coche){
        color=color_coche;
    }

    public String dime_color(){
        return "El color deberia ser: " +color;
    }

    public void configura_asientos(String asientos_cuero){ //setter

        if(asientos_cuero=="si"){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }

    }

    public String dime_asientos(){ // getter
        if(asientos_cuero==true){

            return "El coche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de cuero";
        }
    }

    //Incrementar la velocidad

    public void acelerar(double cantidad) // queremos aumentar velocidad
    {
        velocidad+=cantidad; // velocidad=velocidad+ cantidad
    }

    // disminuir la velocidad
    public void frenar(double cantidad) // aqui vamos a frenar por lo cual queremos disminuir la velocidad
    {
        velocidad-=cantidad;
    }

    // ahora creo un metodo que devuelva la velocidad

    public double obtenerVelocidad() // cada vz que hacemos hay q devovler la sentencia con return
    {
       return velocidad;
    }

    // Comportamiento del coche
    public void avanzar (){

    }

    public void parar(){

    }

    public void girarIzquierda(){

    }

    public void girarDerecha(){

    }
}
