package behavioral.visitor;

public interface ShopingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);

}
