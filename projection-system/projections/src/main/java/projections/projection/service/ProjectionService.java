package projections.projection.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import projections.models.Projection;

public class ProjectionService {
	private static final List<Projection> projections = new ArrayList<>();

	public static String createProjection(String title, String content, Date time) {

		if (title == null || "".equals(title)) {
			return "Въведете заглавие!";
		}

		final Projection newProjection = new Projection();
		newProjection.setContent(content);
		newProjection.setTitle(title);
		newProjection.setDateTime(time);
		projections.add(newProjection);
		return "Успешно добавихте прожекцията!";
	}
}
