package com.codevicious.TaffiGLSConverter;

import java.math.BigDecimal;

import com.univocity.parsers.annotations.*;

public class Etichetta {

	// if the value parsed in the quantity column is "?" or "-", it will be replaced
	// by null.
	@NullString(nulls = { "?", "-" })
	// if a value resolves to null, it will be converted to the String "0".

	@Parsed(field = "Intestatario")
	private String intestatario;

	@Parsed(field = "Numero ordine")
	private long numeroOrdine;

	@Parsed(field = "Referente")
	private String referente;

	@Parsed(field = "Indirizzo")
	private String indirizzo;

	@Parsed(field = "CAP")
	private String CAP;

	@Parsed(field = "Localita")
	private String localita;

	@Parsed(field = "Cod. Provincia")
	private String codProvincia;

	@Parsed(field = "Destinatario telefono")
	private String destinatarioTelefono;

	@Parsed(field = "Email")
	private String email;

	@Parsed(field = "Codice servizio")
	private String codiceServizio;

	@Parsed(field = "Numero colli")
	private int numeroColli;

	@Parsed(field = "Peso")
	private float Peso;

	@Parsed(field = "Riconsegna/Abbandono")
	private String riconsegnaAbbandono;

	@Parsed(field = "Descrizione contenuto")
	private String descrizioneContenuto;

	@Parsed(field = "Note")
	private String note;

	// you can also explicitly give the name of a column in the file.
	// @Parsed(field = "amount")
	// private BigDecimal amount;

}
