package hometransfer;

import com.owlike.genson.annotation.JsonProperty;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;
import java.util.Objects;

@DataType()
public final class Home {

	@Property()
	private final String id;

	@Property()
	private final String name;

	@Property()
	private final String area;

	@Property()
	private final String owner;

	@Property()
	private final String value;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public String getOwner() {
		return owner;
	}

	public String getValue() {
		return value;
	}

	public Home(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
			@JsonProperty("area") final String area, @JsonProperty("owner") final String owner,
			@JsonProperty("value") final String value) {
		this.id = id;
		this.name = name;
		this.area = area;
		this.owner = owner;
		this.value = value;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}

		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}

		Home other = (Home) obj;

		return Objects.deepEquals(new String[] { getId(), getName(), getArea(), getOwner(), getValue() },
				new String[] { other.getId(), other.getName(), other.getArea(), other.getOwner(), other.getValue() });
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getArea(), getOwner(), getValue());
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " [id=" + id + ", name=" + name
				+ ", area=" + area + ", owner=" + owner + ", value=" + value + "]";
	}

}
