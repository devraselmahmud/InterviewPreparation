package solid_principles;

// open/closed principle

public interface InvoiceDAO {

	public void save(InvoiceDAO invoice);
}

class DatabaseInvoiceDAO implements InvoiceDAO {

	@Override
	public void save(InvoiceDAO invoice) {

		// save to DB
	}
}

class FileInvoiceDAO implements InvoiceDAO {

	@Override
	public void save(InvoiceDAO invoice) {

		// save to file
	}
}
