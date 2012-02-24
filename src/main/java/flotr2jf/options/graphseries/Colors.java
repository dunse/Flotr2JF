/**
 * 
 */
package flotr2jf.options.graphseries;

/**
 *
 */
public class Colors extends flotjf.options.graphseries.Colors {
	private String start;
	private String end;

	public Colors(final String... colors) {
		super(colors);
	}
	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * Valid options are "top", "bottom", "left" and "right".
	 * @param start the start to set
	 */
	public void setStart(String start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * Valid options are "top", "bottom", "left" and "right".
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}

}
