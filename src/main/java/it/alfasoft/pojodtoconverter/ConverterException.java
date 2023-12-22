package it.alfasoft.pojodtoconverter;

public class ConverterException extends Exception {
    public ConverterException(){ super(); }
    public ConverterException(String message) { super(message); }
    public ConverterException(Exception e){ super(e); }
}