/**
 * 
 */
package flotr2jf.options;

import java.util.ArrayList;

/**
 * Flotr2 Defaults
 * <pre>
 * colors: ['#00A8F0', '#C0D800', '#CB4B4B', '#4DA74D', '#9440ED'], //=> The default colorscheme. When there are > 5 series, additional colors are generated.
 * ieBackgroundColor: '#FFFFFF', // Background color for excanvas clipping
 * title: null,             // => The graph's title
 * subtitle: null,          // => The graph's subtitle
 * shadowSize: 4,           // => size of the 'fake' shadow
 * defaultType: null,       // => default series type
 * HtmlText: true,          // => wether to draw the text using HTML or on the canvas
 * fontColor: '#545454',    // => default font color
 * fontSize: 7.5,           // => canvas' text font size
 * resolution: 1,           // => resolution of the graph, to have printer-friendly graphs !
 * parseFloat: true,        // => whether to preprocess data for floats (ie. if input is string)
 * </pre>
 */
public class PlotOptions extends flotjf.options.PlotOptions {
	private String title;
	private String subtitle;
	private Integer shadowsize;
	private Boolean HtmlText;
	private String fontColor;
	private Long fontSize;
	private Integer resolution;
	private Boolean parseFloat;

	private Axis xaxis;
	private Axis yaxis;
	private Axis y2axis;
	private Mouse mouse;

	/**
	 * 
	 */
	public PlotOptions() {
		// Call dummy constructor to prevent initialisation of x/yaxes
		super(new Object());
	}


	/**
	 *
	 * @param xAxis TODO
	 */
	public void addXAxis(final Axis xAxis) {
		this.xaxis = xAxis;
	}

	/**
	 *
	 * @param yAxis TODO
	 */
	public void addYAxis(final Axis yAxis) {
		this.yaxis = yAxis;
	}

	/**
	 * Used to assign values to second Y axis
	 * @param yAxis
	 */
	public void addY2Axis(final Axis yAxis) {
		this.y2axis = yAxis;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * The graph's title.<br>
	 * Default:<br>
	 * title: null
	 * @param title String or null. (null = use default value)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * The graph's subtitle.<br>
	 * Default:<br>
	 * subtitle: null
	 * @param subtitle String or null. (null = use default value)
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * @return the shadowsize
	 */
	public Integer getShadowsize() {
		return shadowsize;
	}

	/**
	 * Size of the 'fake' shadow.<br>
	 * Default:<br>
	 * shadowSize: 4
	 * @param shadowsize Integer or null. (null = use default value)
	 */
	public void setShadowsize(Integer shadowsize) {
		this.shadowsize = shadowsize;
	}

	/**
	 * @return the htmlText
	 */
	public Boolean getHtmlText() {
		return HtmlText;
	}

	/**
	 * Wether to draw the text using HTML or on the canvas.<br>
	 * Default:<br>
	 * HtmlText: true
	 * @param htmlText true, false or null. (null = use default value)
	 */
	public void setHtmlText(Boolean htmlText) {
		HtmlText = htmlText;
	}

	/**
	 * @return the fontColor
	 */
	public String getFontColor() {
		return fontColor;
	}

	/**
	 * Default font color.<br>
	 * Default:<br>
	 * fontColor: '#545454'
	 * @param fontColor String or null. (null = use default value)
	 */
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	/**
	 * @return the fontSize
	 */
	public Long getFontSize() {
		return fontSize;
	}

	/**
	 * Canvas' text font size.<br>
	 * Default:<br>
	 * fontSize: 7.5
	 * @param fontSize Long or null. (null = use default value)
	 */
	public void setFontSize(Long fontSize) {
		this.fontSize = fontSize;
	}

	/**
	 * @return the resolution
	 */
	public Integer getResolution() {
		return resolution;
	}

	/**
	 * Resolution of the graph, to have printer-friendly graphs !<br>
	 * Default:<br>
	 * resolution: 1
	 * @param resolution Integer or null. (null = use default value)
	 */
	public void setResolution(Integer resolution) {
		this.resolution = resolution;
	}

	/**
	 * @return the parseFloat
	 */
	public Boolean getParseFloat() {
		return parseFloat;
	}

	/**
	 * Whether to preprocess data for floats (ie. if input is string).<br>
	 * Default:<br>
	 * parseFloat: true
	 * @param parseFloat true, false or null. (null = use default value)
	 */
	public void setParseFloat(Boolean parseFloat) {
		this.parseFloat = parseFloat;
	}


	/**
	 * @return the mouse
	 */
	public Mouse getMouse() {
		return mouse;
	}


	/**
	 * @param mouse the mouse to set
	 */
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
}
