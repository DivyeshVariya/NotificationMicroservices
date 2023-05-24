import React from "react";
import { useAuth } from "./Auth";
import { Navigate, useLocation } from "react-router-dom";

function RequiredAuth({ children }) {
  const location = useLocation();
  const auth = useAuth();
  if (!window.localStorage.getItem("logining")) {
    return <Navigate to="/login" state={{ path: location.pathname }} />;
  }
  return children;
}

export default RequiredAuth;
