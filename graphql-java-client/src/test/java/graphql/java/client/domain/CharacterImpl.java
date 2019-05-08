package graphql.java.client.domain;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import graphql.java.client.NonScalar;
import graphql.java.client.Scalar;

/**
 * @author generated by graphql-maven-plugin
 */
public class CharacterImpl implements Character {

	@Scalar(graphqlType = String.class)
	String id;

	@Scalar(graphqlType = String.class)
	String name;

	@NonScalar(graphqlType = Character.class)
	@JsonDeserialize(contentAs = CharacterImpl.class)
	List<Character> friends;

	@Scalar(graphqlType = Episode.class)
	@JsonDeserialize(contentAs = Episode.class)
	List<Episode> appearsIn;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setFriends(List<Character> friends) {
		this.friends = friends;
	}

	public List<Character> getFriends() {
		return friends;
	}

	public void setAppearsIn(List<Episode> appearsIn) {
		this.appearsIn = appearsIn;
	}

	public List<Episode> getAppearsIn() {
		return appearsIn;
	}

	public String toString() {
		return "CharacterImpl {" + "id: " + id + ", " + "name: " + name + ", " + "friends: " + friends + ", "
				+ "appearsIn: " + appearsIn + "}";
	}
}
