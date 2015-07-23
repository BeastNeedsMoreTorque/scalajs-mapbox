package L.mapbox

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import L._ // FIXME: narrow this down

/**
 * Created by Brandon Elam Barker on 7/22/2015.
 */

@JSName("L.mapbox")
object mapBox extends js.Object {
  var accessToken: String = js.native
}

@JSName("L.mapbox.map")
class Map private (
                          domElement: String,
                          mapDescriptor: js.Any,
                          options: js.Object
                          ) extends js.Object {

  def this (
             domElement: String,
             mapDescriptor: String,
             options: js.Object = null
             ) = this(domElement, mapDescriptor: js.Any, options)

  def this(
            domElement: String,
            mapDescriptor: js.Object,
            options: js.Object
            ) = this(domElement, mapDescriptor: js.Any, options)

  // An unfortunate hack, see: stackoverflow.com/questions/4652095
  def this(
            domElement: String,
            mapDescriptor: js.Object
            ) = this(domElement, mapDescriptor: js.Any, null)

  //TODO:  This is actually included from Popup.js so we may need
  //TODO: to more carefully think about the interface.
  def closePopup(): Map = js.native

  def fitBounds(
                 latlng: LatLngBounds,
                 options: js.Object = null
                 ): Map = js.native

  def setView(coords: js.Array[Double], zoom: Int): Map = js.native

  val attributionControl: ControlAttribution = js.native

}
