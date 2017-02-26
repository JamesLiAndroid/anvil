package trikita.anvil.cardview.v7;

import android.content.res.ColorStateList;
import android.support.v7.widget.CardView;
import android.view.View;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import trikita.anvil.Anvil;
import trikita.anvil.BaseDSL;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateCardViewv7DSL}.
 * It contains views and their setters from the library cardview-v7.
 * Please, don't edit it manually unless for debugging.
 */
public final class CardViewv7DSL implements Anvil.AttributeSetter {
  static {
    Anvil.registerAttributeSetter(new CardViewv7DSL());
  }

  public static BaseDSL.ViewClassResult cardView() {
    return BaseDSL.v(CardView.class);
  }

  public static Void cardView(Anvil.Renderable r) {
    return BaseDSL.v(CardView.class, r);
  }

  public static Void cardBackgroundColor(ColorStateList arg) {
    return BaseDSL.attr("cardBackgroundColor", arg);
  }

  public static Void cardBackgroundColor(int arg) {
    return BaseDSL.attr("cardBackgroundColor", arg);
  }

  public static Void cardElevation(float arg) {
    return BaseDSL.attr("cardElevation", arg);
  }

  public static Void maxCardElevation(float arg) {
    return BaseDSL.attr("maxCardElevation", arg);
  }

  public static Void preventCornerOverlap(boolean arg) {
    return BaseDSL.attr("preventCornerOverlap", arg);
  }

  public static Void radius(float arg) {
    return BaseDSL.attr("radius", arg);
  }

  public static Void useCompatPadding(boolean arg) {
    return BaseDSL.attr("useCompatPadding", arg);
  }

  public boolean set(View v, String name, final Object arg, final Object old) {
    switch (name) {
      case "cardBackgroundColor":
        if (v instanceof CardView && arg instanceof ColorStateList) {
          ((CardView) v).setCardBackgroundColor((ColorStateList) arg);
          return true;
        }
        if (v instanceof CardView && arg instanceof Integer) {
          ((CardView) v).setCardBackgroundColor((int) arg);
          return true;
        }
        break;
      case "cardElevation":
        if (v instanceof CardView && arg instanceof Float) {
          ((CardView) v).setCardElevation((float) arg);
          return true;
        }
        break;
      case "maxCardElevation":
        if (v instanceof CardView && arg instanceof Float) {
          ((CardView) v).setMaxCardElevation((float) arg);
          return true;
        }
        break;
      case "preventCornerOverlap":
        if (v instanceof CardView && arg instanceof Boolean) {
          ((CardView) v).setPreventCornerOverlap((boolean) arg);
          return true;
        }
        break;
      case "radius":
        if (v instanceof CardView && arg instanceof Float) {
          ((CardView) v).setRadius((float) arg);
          return true;
        }
        break;
      case "useCompatPadding":
        if (v instanceof CardView && arg instanceof Boolean) {
          ((CardView) v).setUseCompatPadding((boolean) arg);
          return true;
        }
        break;
    }
    return false;
  }
}
