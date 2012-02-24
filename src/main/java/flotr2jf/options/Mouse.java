/**
 * 
 */
package flotr2jf.options;

/**
 * Flotr2 Defaults
 * <pre>
 * mouse: {
 *     track: false,          // => true to track the mouse, no tracking otherwise
 *     trackAll: false,
 *     position: 'se',        // => position of the value box (default south-east)
 *     relative: false,       // => next to the mouse cursor
 *     trackFormatter: Flotr.defaultTrackFormatter, // => formats the values in the value box
 *     margin: 5,             // => margin in pixels of the valuebox
 *     lineColor: '#FF3F19',  // => line color of points that are drawn when mouse comes near a value of a series
 *     trackDecimals: 1,      // => decimals for the track values
 *     sensibility: 2,        // => the lower this number, the more precise you have to aim to show a value
 *     trackY: true,          // => whether or not to track the mouse in the y axis
 *     radius: 3,             // => radius of the track point
 *     fillColor: null,       // => color to fill our select bar with only applies to bar and similar graphs (only bars for now)
 *     fillOpacity: 0.4       // => opacity of the fill color, set to 1 for a solid fill, 0 hides the fill
 *  }</pre>
 */
public class Mouse {
	private Boolean track;
	private Boolean trackAll;
	private String position;
	private Boolean relative;
	private String trackFormatter;
	private Integer margin;
	private String lineColor;
	private Integer trackDecimals;
	private Integer sensibility;
	private Boolean trackY;
	private Integer radius;
	private String fillColor;
	private Long fillOpacity;
	
	/**
	 * @return the track
	 */
	public Boolean getTrack() {
		return track;
	}

	/**
	 * True to track the mouse, no tracking otherwise.<br>
	 * Default:<br>
	 * track: false
	 * @param track true, false or null. (null = use default value)
	 */
	public void setTrack(Boolean track) {
		this.track = track;
	}

	/**
	 * @return the trackAll
	 */
	public Boolean getTrackAll() {
		return trackAll;
	}

	/**
	 * Default:<br>
	 * trackAll: false
	 * @param trackAll true, false or null. (null = use default value)
	 */
	public void setTrackAll(Boolean trackAll) {
		this.trackAll = trackAll;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Position of the value box (default south-east).<br>
	 * Default:<br>
	 * position: 'se'
	 * @param position String or null. (null = use default value)
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the relative
	 */
	public Boolean getRelative() {
		return relative;
	}

	/**
	 * Next to the mouse cursor.<br>
	 * Default:<br>
	 * relative: false
	 * @param relative true, false or null. (null = use default value)
	 */
	public void setRelative(Boolean relative) {
		this.relative = relative;
	}

	/**
	 * @return the trackFormatter
	 */
	public String getTrackFormatter() {
		return trackFormatter;
	}

	/**
	 * Formats the values in the value box.<br>
	 * Default:<br>
	 * trackFormatter: Flotr.defaultTrackFormatter
	 * @param trackFormatter String or null. (null = use default value)
	 */
	public void setTrackFormatter(String trackFormatter) {
		this.trackFormatter = trackFormatter;
	}

	/**
	 * @return the margin
	 */
	public Integer getMargin() {
		return margin;
	}

	/**
	 * Margin in pixels of the valuebox.<br>
	 * Default:<br>
	 * margin: 5
	 * @param margin Integer or null. (null = use default value)
	 */
	public void setMargin(Integer margin) {
		this.margin = margin;
	}

	/**
	 * @return the lineColor
	 */
	public String getLineColor() {
		return lineColor;
	}

	/**
	 * Line color of points that are drawn when mouse comes near a value of a series.<br>
	 * Default:<br>
	 * lineColor: '#FF3F19'
	 * @param lineColor String or null. (null = use default value)
	 */
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	/**
	 * @return the trackDecimals
	 */
	public Integer getTrackDecimals() {
		return trackDecimals;
	}

	/**
	 * Decimals for the track values.<br>
	 * Default:<br>
	 * trackDecimals: 1
	 * @param trackDecimals Integer or null. (null = use default value)
	 */
	public void setTrackDecimals(Integer trackDecimals) {
		this.trackDecimals = trackDecimals;
	}

	/**
	 * @return the sensibility
	 */
	public Integer getSensibility() {
		return sensibility;
	}

	/**
	 * The lower this number, the more precise you have to aim to show a value.<br>
	 * Default:<br>
	 * sensibility: 2
	 * @param sensibility Integer or null. (null = use default value)
	 */
	public void setSensibility(Integer sensibility) {
		this.sensibility = sensibility;
	}

	/**
	 * @return the trackY
	 */
	public Boolean getTrackY() {
		return trackY;
	}

	/**
	 * Whether or not to track the mouse in the y axis.<br>
	 * Default:<br>
	 * trackY: true
	 * @param trackY true, false or null. (null = use default value)
	 */
	public void setTrackY(Boolean trackY) {
		this.trackY = trackY;
	}

	/**
	 * @return the radius
	 */
	public Integer getRadius() {
		return radius;
	}

	/**
	 * Radius of the track point.<br>
	 * Default:<br>
	 * radius: 3
	 * @param radius Integer or null. (null = use default value)
	 */
	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	/**
	 * @return the fillColor
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * Colour to fill our select bar with only applies to bar and similar graphs (only bars for now).<br>
	 * Default:<br>
	 * fillColor: null
	 * @param fillColor String or null. (null = use default value)
	 */
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * @return the fillOpacity
	 */
	public Long getFillOpacity() {
		return fillOpacity;
	}

	/**
	 * Opacity of the fill color, set to 1 for a solid fill, 0 hides the fill.<br>
	 * Default:<br>
	 * fillOpacity: 0.4
	 * @param fillOpacity Long or null. (null = use default value)
	 */
	public void setFillOpacity(Long fillOpacity) {
		this.fillOpacity = fillOpacity;
	}
}
