package io.github.culpen90.rillvoro.views;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;

import io.github.culpen90.rillvoro.util.RillvoroTextViewHelper;
import io.github.culpen90.rillvoro.util.external_communication.ShareUtils;

/**
 * An {@link AppCompatEditText} which uses {@link ShareUtils#shareText(Context, String, String)}
 * when sharing selected text by using the {@code Share} command of the floating actions.
 *
 * <p>
 * This class allows Rillvoro to show Android share sheet instead of EMUI share sheet when sharing
 * text from {@link AppCompatEditText} on EMUI devices.
 * </p>
 */
public class RillvoroEditText extends AppCompatEditText {

    public RillvoroEditText(@NonNull final Context context) {
        super(context);
    }

    public RillvoroEditText(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
    }

    public RillvoroEditText(@NonNull final Context context,
                           @Nullable final AttributeSet attrs,
                           final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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
