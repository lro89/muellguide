package mawi.muellguidems.parseobjects;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Mappingobjekt für die Parse Klasse "OeffungszeitenContainer".
 */
@ParseClassName("OeffnungszeitenContainer")
public class OeffungszeitenContainer extends ParseObject {

	public OeffungszeitenContainer() {
	}

	public String getId() {
		return getObjectId();
	}

	public String getWochentag() {
		return getString("Wochentag");
	}

	public String getEnde() {
		return getString("ende");
	}

	public ParseObject getEntsorgungsart() {
		return getParseObject("fkEntsorgungsart");
	}

	public String getStart() {
		return getString("start");
	}

	public static ParseQuery<OeffungszeitenContainer> getQuery() {
		ParseQuery<OeffungszeitenContainer> query = ParseQuery
				.getQuery(OeffungszeitenContainer.class);
		query.include("Entsorgungsart");
		return query;
	}
}
