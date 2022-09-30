package me.blessedmahuni.lostandfound.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ResponseBody {
    @NonNull
    private String message;
    @NonNull
    private Boolean success;
    private Object data = null;
}
