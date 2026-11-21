package io.github.culpen90.rillvoro.views;

import android.content.Context;
import android.text.method.MovementMethod;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import io.github.culpen90.rillvoro.util.RillvoroTextViewHelper;
import io.github.culpen90.rillvoro.util.external_communication.ShareUtils;

/**
 * An {@link AppCompatTextView} which uses {@link ShareUtils#shareText(Context, String, String)}
 * when sharing selected text by using the {@code Share} command of the floating actions.
 *
 * <p>
 * This class allows Rillvoro to show Android share sheet instead of EMUI share sheet when sharing
 * text from {@link AppCompatTextView} on EMUI devices and also to keep movement method set when a
 * text change occurs, if the text cannot be selected and text links are clickable.
 * </p>
 */
public class RillvoroTextView extends AppCompatTextView {

    public RillvoroTextView(@NonNull final Context context) {
        super(context);
    }

    public RillvoroTextView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
    }

    public RillvoroTextView(@NonNull final Context context,
                           @Nullable final AttributeSet attrs,
                           final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setText(final CharSequence text, final BufferType type) {
        // We need to set again the movement method after a text change because Android resets the
        // movement method to the default one in the case where the text cannot be selected and
        // text links are clickable (which is the default case in Rillvoro).
        final MovementMethod movementMethod = this.getMovementMethod();
        super.setText(text, type);
        setMovementMethod(movementMethod);
    }

    @Override
    public boolean onTextContextMenuItem(final int id) {
        if (id == android.R.id.shareText) {
            RillvoroTextViewHelper.shareSelectedTextWithShareUtils(this);
            return true;
        }
        return super.onTextContextMenuItem(id);
    }
}
