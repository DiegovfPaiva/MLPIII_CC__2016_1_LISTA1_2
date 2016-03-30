
public class Item implements Comparable<Item>{

	private Integer codItem;
	private String descItem;
	
	public Item() {
	}
	public Item(Integer codItem, String descItem) {
		this.codItem = codItem;
		this.descItem = descItem;
	}
	public Integer getCodItem() {
		return codItem;
	}
	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}
	public String getDescItem() {
		return descItem;
	}
	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}
	
	@Override
	public String toString() {
		return "Item [codItem=" + codItem + ", descItem=" + descItem + "]";
	}
	@Override
	public int compareTo(Item o) {
		if(this.codItem > o.getCodItem())
			return 1;
		else if (this.codItem < o.getCodItem())
			return -1;
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codItem == null) ? 0 : codItem.hashCode());
		result = prime * result + ((descItem == null) ? 0 : descItem.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (codItem == null) {
			if (other.codItem != null)
				return false;
		} else if (!codItem.equals(other.codItem))
			return false;
		if (descItem == null) {
			if (other.descItem != null)
				return false;
		} else if (!descItem.equals(other.descItem))
			return false;
		return true;
	}
	
}
