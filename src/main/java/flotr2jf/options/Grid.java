/**
 * 
 */
package flotr2jf.options;

/**
 * Flotr2 Defaults
 * <pre>
 * grid: {
 *   color: '#545454',      // => primary color used for outline and labels
 *   backgroundColor: null, // => null for transparent, else color
 *   backgroundImage: null, // => background image. String or object with src, left and top
 *   watermarkAlpha: 0.4,   // => 
 *   tickColor: '#DDDDDD',  // => color used for the ticks
 *   labelMargin: 3,        // => margin in pixels
 *   verticalLines: true,   // => whether to show gridlines in vertical direction
 *   minorVerticalLines: null, // => whether to show gridlines for minor ticks in vertical dir.
 *   horizontalLines: true, // => whether to show gridlines in horizontal direction
 *   minorHorizontalLines: null, // => whether to show gridlines for minor ticks in horizontal dir.
 *   outlineWidth: 1,       // => width of the grid outline/border in pixels
 *   circular: false        // => if set to true, the grid will be circular, must be used when radars are drawn
 * }</pre>
 */
public class Grid extends flotjf.options.Grid {
	private String backgroundImage;
	private Long watermarkAlpha;
	private String tickColor;
	private Boolean verticalLines;
	private Boolean minorVerticalLines;
	private Boolean horizontalLines;
	private Boolean minorHorizontalLines;
	private Integer outlineWidth;
	private Boolean circular;
	
	/**
	 * 
	 */
	public Grid() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the backgroundImage
	 */
	public String getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * Background image. String or object with src, left and top
	 * Default:<br>
	 * backgroundImage: null
	 * @param backgroundImage String or null (null = use default value)
	 */
	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	/**
	 * @return the watermarkAlpha
	 */
	public Long getWatermarkAlpha() {
		return watermarkAlpha;
	}

	/**
	 * Default:<br>
	 * watermarkAlpha: 0.4
	 * @param watermarkAlpha Long or null (null = use default value)
	 */
	public void setWatermarkAlpha(Long watermarkAlpha) {
		this.watermarkAlpha = watermarkAlpha;
	}

	/**
	 * @return the tickColor
	 */
	public String getTickColor() {
		return tickColor;
	}

	/**
	 * Colour used for the ticks
	 * Default:<br>
	 * tickColor: '#DDDDDD'
	 * @param tickColor String or null (null = use default value)
	 */
	public void setTickColor(String tickColor) {
		this.tickColor = tickColor;
	}

	/**
	 * @return the verticalLines
	 */
	public Boolean getVerticalLines() {
		return verticalLines;
	}

	/**
	 * Whether to show gridlines in vertical direction<br>
	 * Default:<br>
	 * verticalLines: true
	 * @param verticalLines true, false or null. (null = use default value)
	 */
	public void setVerticalLines(Boolean verticalLines) {
		this.verticalLines = verticalLines;
	}

	/**
	 * @return the minorVerticalLines
	 */
	public Boolean getMinorVerticalLines() {
		return minorVerticalLines;
	}

	/**
	 * Whether to show gridlines for minor ticks in vertical dir.<br>
	 * Default:<br>
	 * minorVerticalLines: null
	 * @param minorVerticalLines true, false or null. (null = use default value)
	 */
	public void setMinorVerticalLines(Boolean minorVerticalLines) {
		this.minorVerticalLines = minorVerticalLines;
	}

	/**
	 * @return the horizontalLines
	 */
	public Boolean getHorizontalLines() {
		return horizontalLines;
	}

	/**
	 * Whether to show gridlines in horizontal direction<br>
	 * Default:<br>
	 * horizontalLines: true
	 * @param horizontalLines true, false or null. (null = use default value)
	 */
	public void setHorizontalLines(Boolean horizontalLines) {
		this.horizontalLines = horizontalLines;
	}

	/**
	 * @return the minorHorizontalLines
	 */
	public Boolean getMinorHorizontalLines() {
		return minorHorizontalLines;
	}

	/**
	 * Whether to show gridlines for minor ticks in horizontal dir.<br>
	 * Default:<br>
	 * minorHorizontalLines: null
	 * @param minorHorizontalLines true, false or null. (null = use default value)
	 */
	public void setMinorHorizontalLines(Boolean minorHorizontalLines) {
		this.minorHorizontalLines = minorHorizontalLines;
	}

	/**
	 * @return the outlineWidth
	 */
	public Integer getOutlineWidth() {
		return outlineWidth;
	}

	/**
	 * Width of the grid outline/border in pixels.<br>
	 * Default:<br>
	 * outlineWidth: 1
	 * @param outlineWidth Integer or null. (null = use default value)
	 */
	public void setOutlineWidth(Integer outlineWidth) {
		this.outlineWidth = outlineWidth;
	}

	/**
	 * @return the circular
	 */
	public Boolean getCircular() {
		return circular;
	}

	/**
	 * If set to true, the grid will be circular, must be used when radars are drawn.<br>
	 * Default:<br>
	 * circular: false
	 * @param circular true, false or null. (null = use default value)
	 */
	public void setCircular(Boolean circular) {
		this.circular = circular;
	}

}
