package it.alfasoft.pojodtoconverter;

import it.alfasoft.daosimple.IDto;

import java.util.List;

public interface IConverterPojoDto<T extends IPOJO,U extends IDto> {
    T convertDtoToPojo(U oggettoDto) throws ConverterException;
    U convertPojoToDto(T oggettoPojo) throws ConverterException;
    List<T> convertListDtoToPojo(List<U> dtosFromDao) throws ConverterException;
    List<U> convertListPojoToDto(List<T> pojosFromJX) throws ConverterException;
}
