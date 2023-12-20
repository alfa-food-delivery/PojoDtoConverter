package it.alfasoft.pojodtoconverter;

import it.alfasoft.daosimple.IDto;

import java.util.List;

public abstract class ConverterGenerico<T extends IPOJO, U extends IDto> implements IConverterPojoDto<T,U>{
    public abstract T convertDtoToPojo(U oggettoDto) throws ConverterException;
    public abstract U convertPojoToDto(T oggettoPojo) throws ConverterException;
    public abstract List<T> convertListDtoToPojo(List<U> dtosFromDao) throws ConverterException;
    public abstract List<U> convertListPojoToDto(List<T> pojosFromJX) throws ConverterException;
}