package behavioral.visitor;

public interface ItemElement {

	int accept(ShopingCartVisitor visitor);
}
