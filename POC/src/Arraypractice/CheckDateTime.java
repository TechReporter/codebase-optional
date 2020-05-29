/**
 * 
 */
package Arraypractice;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.Temporal;

/**
 * @author 212720190
 * @date Jan 30, 2020
 */
public class CheckDateTime {




	public static void main(String[] args) {
		DateTimeFormatter DATE_FORMATTER_WITH_ZONE =
				DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss['Z']");
		
		String date = "20191231T170000:00";
		DateTimeFormatter formatter =  new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
			    .optionalStart().appendOffsetId()
			    .toFormatter();

		OffsetDateTime odt = OffsetDateTime.parse(date);
		Instant instant = odt.toInstant();

		Temporal parsed = (Temporal) DATE_FORMATTER_WITH_ZONE.parseBest(date, Instant::from, LocalDateTime::from);
		if (parsed instanceof Instant) {
		    instant = (Instant) parsed;
		} else if (parsed instanceof LocalDateTime) {
		    // convert LocalDateTime to UTC instant
		    instant = ((LocalDateTime) parsed).atOffset(ZoneOffset.UTC).toInstant();
		}
		System.out.println(instant); 
	}

}
