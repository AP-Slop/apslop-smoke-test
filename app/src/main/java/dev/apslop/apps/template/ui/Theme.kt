package dev.apslop.apps.template.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF1E5EFF),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFDCE4FF),
    onPrimaryContainer = Color(0xFF00174B),
    secondary = Color(0xFF5B6B8C),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFDDE3F5),
    onSecondaryContainer = Color(0xFF18233A),
    tertiary = Color(0xFF00A385),
    onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFFFDFBFF),
    onBackground = Color(0xFF1A1B20),
    surface = Color(0xFFFDFBFF),
    onSurface = Color(0xFF1A1B20),
    surfaceVariant = Color(0xFFE2E2EC),
    onSurfaceVariant = Color(0xFF45464F),
    outline = Color(0xFF767680),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF9DB7FF),
    onPrimary = Color(0xFF002B75),
    primaryContainer = Color(0xFF0043A8),
    onPrimaryContainer = Color(0xFFDCE4FF),
    secondary = Color(0xFFB9C6E6),
    onSecondary = Color(0xFF25334E),
    secondaryContainer = Color(0xFF3B4864),
    onSecondaryContainer = Color(0xFFDDE3F5),
    tertiary = Color(0xFF5FE0C1),
    onTertiary = Color(0xFF00382C),
    background = Color(0xFF111318),
    onBackground = Color(0xFFE3E2E9),
    surface = Color(0xFF111318),
    onSurface = Color(0xFFE3E2E9),
    surfaceVariant = Color(0xFF45464F),
    onSurfaceVariant = Color(0xFFC6C6D0),
    outline = Color(0xFF90909A),
)

/**
 * App theme. Follows the system dark mode setting (values-night/themes.xml handles the
 * window background, this handles every Compose surface).
 */
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content,
    )
}
