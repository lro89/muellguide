package mawi.muellguidems.parseobjects;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Mappingobjekt für die Parse Klasse "Gegenstand".
 */
@ParseClassName("Gegenstand")
public class Gegenstand extends ParseObject {

	public Gegenstand() {
	}

	public String getObjectId() {
		return getObjectId();
	}

	public String getBezeichnung() {
		return getString("bezeichnung");
	}

	public ParseObject getEntsorgungsart() {
		return getParseObject("fkEntsorgungsart");
	}

	public static ParseQuery<Gegenstand> getQuery() {
		ParseQuery<Gegenstand> query = ParseQuery.getQuery(Gegenstand.class);
		query.include("Entsorgungsart");
		return query;
	}
}
