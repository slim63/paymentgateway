package cz.monetplus.mips.eapi.v19.connector.entity;

public interface Signable {

	/**
	 *
	 * @return
	 */
	String toSign();

	/**
	 * (hp)
	 *
	 * @return
	 */
	default String getMerchantId() {
		return null;
	}
}
