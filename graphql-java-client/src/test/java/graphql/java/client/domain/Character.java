package graphql.java.client.domain;

import java.util.List;

import graphql.java.client.NonScalar;
import graphql.java.client.Scalar;

/**
 * @author generated by graphql-maven-plugin
 */
public interface Character {

	@Scalar(graphqlType = String.class)
	public void setId(String id);

	@Scalar(graphqlType = String.class)
	public String getId();

	@Scalar(graphqlType = String.class)
	public void setName(String name);

	@Scalar(graphqlType = String.class)
	public String getName();

	@NonScalar(graphqlType = Character.class)
	public void setFriends(List<Character> friends);

	@NonScalar(graphqlType = Character.class)
	public List<Character> getFriends();

	@Scalar(graphqlType = Episode.class)
	public void setAppearsIn(List<Episode> appearsIn);

	@Scalar(graphqlType = Episode.class)
	public List<Episode> getAppearsIn();
}
