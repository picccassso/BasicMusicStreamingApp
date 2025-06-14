// Generated by view binder compiler. Do not edit!
package com.bma.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bma.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecentlyPlayedSongBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView albumArtwork;

  @NonNull
  public final TextView artistText;

  @NonNull
  public final ImageView removeButton;

  @NonNull
  public final TextView titleText;

  private ItemRecentlyPlayedSongBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView albumArtwork, @NonNull TextView artistText,
      @NonNull ImageView removeButton, @NonNull TextView titleText) {
    this.rootView = rootView;
    this.albumArtwork = albumArtwork;
    this.artistText = artistText;
    this.removeButton = removeButton;
    this.titleText = titleText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecentlyPlayedSongBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecentlyPlayedSongBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recently_played_song, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecentlyPlayedSongBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.albumArtwork;
      ImageView albumArtwork = ViewBindings.findChildViewById(rootView, id);
      if (albumArtwork == null) {
        break missingId;
      }

      id = R.id.artistText;
      TextView artistText = ViewBindings.findChildViewById(rootView, id);
      if (artistText == null) {
        break missingId;
      }

      id = R.id.removeButton;
      ImageView removeButton = ViewBindings.findChildViewById(rootView, id);
      if (removeButton == null) {
        break missingId;
      }

      id = R.id.titleText;
      TextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      return new ItemRecentlyPlayedSongBinding((ConstraintLayout) rootView, albumArtwork,
          artistText, removeButton, titleText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
