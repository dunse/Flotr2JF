/**
 * 
 */
package flotr2jf;

import java.util.ArrayList;

import com.google.gson.Gson;

import flotr2jf.data.PlotData;
import flotr2jf.options.Mouse;
import flotr2jf.options.PlotOptions;
import flotr2jf.options.Axis;
import flotr2jf.options.Grid;

/**
 * 
 * @author PJ
 *
 */
public class Chart extends PlotOptions {
	/** */
	private ArrayList<PlotData> chartsdata;


	/**
	 * 
	 */
	public Chart() {
		chartsdata = new ArrayList<PlotData>();
	}

	/**
	 * @param chart TODO
	 */
	public void addElements(final PlotData chart) {
		chartsdata.add(chart);
	}


	/**
	 * @return JSON {@link String} of data
	 */
	public String printChart(){
		Gson gson = new Gson();
		StringBuffer json = new StringBuffer();

		json.append("[");
		for (PlotData chartdata: this.chartsdata) {
			if (json.length() > 1) {
				json.append(",");
			}
			json.append(gson.toJson(chartdata, chartdata.getClass()));
		}
		json.append("]");

		return json.toString();
	}

	/**
	 * @return JSON {@link String} of options
	 */
	public String printChartOptions(){
		Gson gson = new Gson();
		return gson.toJson(this, PlotOptions.class);
	}

	/**
	 * 
	 * @param grid TODO
	 */
	public void addGrid(final Grid grid) {
		this.setGrid(grid);
	}

	public void useMouse() {
		Mouse mouse = new Mouse();
		mouse.setTrack(true);
		mouse.setTrackAll(true);
		mouse.setRelative(true);
		this.setMouse(mouse);
	}
}
